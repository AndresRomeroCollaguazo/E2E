package com.swag.pe.utilities;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JSONReader {

    private static final String FILE_PATH = "src/test/resources/testdata.json";

    public static JsonNode getJsonData() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readTree(new File(FILE_PATH));
        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo JSON: " + e.getMessage());
        }
    }

    public static String getValue(String key) {
        JsonNode jsonData = getJsonData();
        return jsonData.get(key).asText();
    }
}

