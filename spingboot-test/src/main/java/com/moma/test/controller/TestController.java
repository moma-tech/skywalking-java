package com.moma.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @GetMapping("/test")
    public String testRequest(String traceId){
        LOGGER.info("Test Request "+ traceId);
        return "This is a test";
    }
}
