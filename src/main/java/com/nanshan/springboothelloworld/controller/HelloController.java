package com.nanshan.springboothelloworld.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

/**
 * @author RogerLo
 * @date 2023/10/4
 */
@RestController
@RequestMapping(path = "/helloController")
public class HelloController {

    // private final Logger logger = LoggerFactory.getLogger(HelloController.class);
    private Logger logger = LogManager.getLogger(HelloController.class);

    /**
     * URL: http://localhost:8070/SpringBootHelloWorld/helloController/sayHello
     */
    @GetMapping(path = "/sayHello", produces = { MediaType.TEXT_PLAIN_VALUE })
    @Scheduled(fixedDelay = 3000)
    public String sayHello() {
        logger.info("=== Say Hello ===");
        IntStream.rangeClosed(1, 30000).forEach(i -> {
            logger.info(">>> @Scheduled 觸發: {} - @@@測試@@@", i);
        });
        return "Hello world!";
    }

}
