package com.tmr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tests")
public class test {
    @RequestMapping("test1")
    public String test1(){
        return "redirect:/index.jsp";
    }
}
