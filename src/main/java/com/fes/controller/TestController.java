package com.fes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/find")
public class TestController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("test************");
        return "find/test";
    }
}
