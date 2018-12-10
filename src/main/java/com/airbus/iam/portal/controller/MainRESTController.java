package com.airbus.iam.portal.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class MainRESTController {

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
    @PostMapping(value = "/transfo")
    public String transformation(@RequestBody String payload) throws Exception{

        System.out.println(payload);

        return payload;
    }
}
