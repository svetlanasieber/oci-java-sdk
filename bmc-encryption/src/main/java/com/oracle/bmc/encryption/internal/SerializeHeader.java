/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.encryption.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.encryption.KmsMasterKey;
import com.oracle.bmc.encryption.MasterKeyProvider;
import net.minidev.json.JSONObject;

public class SerializeHeader {
    private final MasterKeyProvider provider;
    private final static int INITIAL_OFFSET = 6; //version(short) + header_size(int)
    private final static short VERSION = 1;

    public SerializeHeader(MasterKeyProvider provider) {
        this.provider = provider;
    }

    // Encryption Header
    public EncryptionHeader createHeader(
            DataKey dataKey, byte[] IVbytes, Map<String, String> context) {
        EncryptionHeader encryptionHeader = createEncryptionHeader(dataKey, IVbytes, context);
        String jsonHeader = serializeJsonHeader(encryptionHeader);
        int headerLength = jsonHeader.getBytes().length;
        ByteBuffer buffer = ByteBuffer.allocate(INITIAL_OFFSET + headerLength);
        buffer.putShort(VERSION);
        buffer.putInt(headerLength);
        buffer.put(jsonHeader.getBytes());
        byte[] headerBytes = buffer.array();
        encryptionHeader.setHeaderBytes(headerBytes);
        return encryptionHeader;
    }

    private EncryptionHeader createEncryptionHeader(
            DataKey dataKey, byte[] ivBytes, Map<String, String> context) {
        EncryptionHeader encryptionHeader = new EncryptionHeader();
        KmsMasterKey kmsMasterKey = (KmsMasterKey) provider.getMasterKey();
        EncryptionKey encryptionKey =
                new EncryptionKey(
                        kmsMasterKey.getRegion(),
                        kmsMasterKey.getVaultId(),
                        kmsMasterKey.getKmsMasterKeyId(),
                        dataKey.getCiphertext());

        String contextString = "";
        if (context != null) {
            JSONObject contextJson = new JSONObject(context);
            contextString = contextJson.toJSONString();
        }
        encryptionHeader.setEncryptionHeader(
                encryptionKey, Base64.getEncoder().encodeToString(ivBytes), contextString);
        return encryptionHeader;
    }

    private String serializeJsonHeader(EncryptionHeader encryptionHeader) {
        String jsonOutput = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            jsonOutput = objectMapper.writeValueAsString(encryptionHeader);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to parse encryption header. ", e);
        }
        return jsonOutput;
    }

    /////////////////////////////////////////////////////////////////////////////////////
    // Read Decryption Header
    /////////////////////////////////////////////////////////////////////////////////////

    public EncryptionHeader deserializeJsonHeader(byte[] header) {
        EncryptionHeader encryptionHeader;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            encryptionHeader = objectMapper.readValue(header, EncryptionHeader.class);
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse encryption header.", e);
        }
        return encryptionHeader;
    }

    public EncryptionHeader readHeader(final InputStream decryptInputStream) throws IOException {
        // Read header intro
        byte[] readHeaderIntroBytes = new byte[INITIAL_OFFSET];
        readBytesFromStream(decryptInputStream, readHeaderIntroBytes);

        int jsonHeaderSize = getHeaderSize(readHeaderIntroBytes);

        // Read header Json
        byte[] jsonHeaderBytes = new byte[jsonHeaderSize];
        readBytesFromStream(decryptInputStream, jsonHeaderBytes);

        return deserializeJsonHeader(jsonHeaderBytes);
    }

    public int getHeaderSize(byte[] data) {
        ByteBuffer introHeader = ByteBuffer.wrap(data);
        short version = introHeader.getShort();
        if (version != VERSION) {
            throw new RuntimeException(
                    "Encryption header from the encrypted file ("
                            + version
                            + ") doesn't match expected version ("
                            + VERSION
                            + "). Check if this encrypted file has the correct format.");
        }
        int size = introHeader.getInt();
        if (size <= 0) {
            throw new RuntimeException(
                    "Failed to read a valid encryption header size. Check if this encrypted file has the correct format.");
        }
        return size;
    }

    private int readBytesFromStream(final InputStream decryptInputStream, byte[] readBytes)
            throws IOException {
        int readResult = decryptInputStream.read(readBytes);
        if (readResult <= 0) {
            throw new RuntimeException("Failed to read header from stream. Reached end of stream.");
        }
        return readResult;
    }
}