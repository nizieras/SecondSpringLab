package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyStringAction {

    private final Logger logger = LoggerFactory.getLogger(MyStringAction.class);

    public String stringToUpCase(String line){
        logger.info("String successfully transfer to up case");
        return line.toUpperCase();
    }

    public String stringToLowCase(String line){
        logger.info("String successfully transfer to low case");
        return line.toLowerCase();
    }

    public String stringUnion(String firstLine, String secondLine){
        logger.info("Strings successfully united");
        return firstLine + secondLine;
    }
}
