package com.airbus.iam.portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@RestController
@RequestMapping("api/v1/")
public class MainRESTController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainRESTController.class);

    @Value("${git.base.url}")
    private String gitUrl;

    /**
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String hello() throws IOException {
        LOGGER.info("//////////////////////////////////");
        LOGGER.info("Git URL" + gitUrl);
        LOGGER.info("//////////////////////////////////");
        LOGGER.info("//////////////////////////////////");
        LOGGER.info("//////////////////////////////////");
        LOGGER.info("//////////////////////////////////");

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
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd_hh-mm-ss");
        String strDate = dateFormat.format(date);

        String data = "{\n" +
                "  \"A\": {\n" +
                "    \"text\": \"fix conf\"\n" +
                "  },\n" +
                "  \"B\": {\n" +
                "    \"text\": \"admin conf\"\n" +
                "  },\n" +
                "  \"C\": {\n" +
                "    \"text\": \"user conf\"" + strDate + "\n" +
                "  }\n" +
                "}";
        return data;
    }

}