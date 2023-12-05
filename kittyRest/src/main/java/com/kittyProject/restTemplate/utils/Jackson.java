package com.kittyProject.restTemplate.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Jackson {

    public static ObjectMapper getObjectMapper = mapper();

    public static ObjectMapper mapper(){
        ObjectMapper defaultMapper = new ObjectMapper();
        return defaultMapper;
    }

    public static JsonNode node(String toMap) throws IOException {
        return getObjectMapper.readTree(toMap);
    }

}
