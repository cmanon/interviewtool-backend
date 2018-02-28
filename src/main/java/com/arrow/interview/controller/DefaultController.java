package com.arrow.interview.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cmanon on 7/14/16.
 */

@RestController
@EnableAutoConfiguration
public class DefaultController {

    @RequestMapping("/")
    String home() {
        return "ping";
    }

}
