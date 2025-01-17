package com.example.tracklover.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

public class ConverterDados {

    ObjectMapper mapper = new ObjectMapper();

    public <T> T obterDados(String json, Class<T> classe){

        try {
            return mapper.readValue(json,classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }


}
