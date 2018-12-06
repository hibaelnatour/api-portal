package com.airbus.iam.portal.main.java.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class MainController {

    /**
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    String hello() {
        return "Hello page !";
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/corpsso", method = RequestMethod.GET)
    String corpsso() {
        return "Corpsso called!";
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/transfo", method = RequestMethod.GET)
    String Transfo() {
        return "Data Transfo called!";
    }
}
