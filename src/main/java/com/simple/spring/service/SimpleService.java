package com.simple.spring.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.simple.spring.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.nio.charset.StandardCharsets;

@Service
public class SimpleService {

    private static  final Logger LOGGER = LoggerFactory.getLogger(SimpleService.class);

    @Autowired
    private ObjectMapper objectMapper;

    @PostConstruct
    public void simpleMethodOne() throws JsonProcessingException {
        String s = "hereIsSomeData";
        String writeValueAsString = objectMapper.writeValueAsString(s.getBytes(StandardCharsets.UTF_8));
        LOGGER.info("simpleMethodOne() :: {} writeValueAsString :: {}", s, writeValueAsString);
        callingMethod(s, writeValueAsString);
    }

    private void callingMethod(String s, String writeValueAsString) {

        Person person = new Person(1, writeValueAsString, null);
        LOGGER.info("callingMethod() :: {} writeValueAsString :: {} person :: {}", s, writeValueAsString, person.getName());
        LOGGER.info(new String(writeValueAsString.getBytes()));
    }

}
