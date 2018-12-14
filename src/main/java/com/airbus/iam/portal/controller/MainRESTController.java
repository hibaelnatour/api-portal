package com.airbus.iam.portal.controller;

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