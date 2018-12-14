package com.airbus.iam.portal.controller;

import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

@RestController
@RequestMapping("api/v1/")
public class MainRESTController {

    /**
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String hello() throws IOException {
        return "Hello !!!";
    }

    /**
     *
     * @return
     */
    @PostMapping(value = "/corpsso")
    public String corpsso(@RequestBody String payload) throws Exception{

        return "Corpsso called!";

    }

    /**
     *
     * @return
     */
    @PostMapping(value = "/transfo")
    public String transformation(@RequestBody String payload) throws Exception{

        System.out.println(payload);

        String data = "";
        data = new String(Files.readAllBytes(Paths.get("src/main/resources/test.json")));
        return data;
    }

}
