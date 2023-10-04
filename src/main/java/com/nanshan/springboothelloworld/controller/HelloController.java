package com.nanshan.springboothelloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RogerLo
 * @date 2023/10/4
 */
@RestController
@RequestMapping(path = "/helloController")
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    /**
     * URL: http://localhost:8070/SpringBootHelloWorld/helloController/sayHello
     */
    @GetMapping(path = "/sayHello", produces = { MediaType.TEXT_PLAIN_VALUE })
    public String sayHello() {
        logger.info("=== Say Hello ===");
        return "Hello world!";
    }

}
