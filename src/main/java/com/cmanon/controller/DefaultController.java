package com.cmanon.controller;

import com.cmanon.entity.Greeting;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cmanon on 7/14/16.
 */

@RestController
@EnableAutoConfiguration
public class DefaultController {

    @RequestMapping("/")
    String home() {
        return "Hello Spring!";
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Wolrd") String name) {
        return new Greeting(1, name);
    }

}
