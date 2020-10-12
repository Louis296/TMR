package com.tmr.controller;

import com.tmr.po.User;
import com.tmr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/logincheck")
    public String loginCheck(){
        return "redirect:/index.jsp";
    }

    @RequestMapping("/register")
    public String register(User user){
        userService.register(user);
        return "redirect:/index.jsp";
    }


}
