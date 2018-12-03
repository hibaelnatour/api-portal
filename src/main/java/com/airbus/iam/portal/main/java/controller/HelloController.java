package com.airbus.iam.portal.main.java.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test for Spring Boot with a Hello World
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    String helloWorld() {
        return "Hello World !";
    }

    /**
     * @param name
     * @return
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
