package com.api.juso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/juso")
@Controller
public class JusoController {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getJuso() {
        return "juso";
    }
}
