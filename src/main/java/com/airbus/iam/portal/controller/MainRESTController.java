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

        String var = "{\n" +
                    "     \"E\": {\n" +
                    "        \"text\": \"Hiba conf testing\"\n" +
                    "     }\n" +
                    "}";

        return var;
    }
}
