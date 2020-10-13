package com.tmr.controller;

import com.tmr.po.User;
import com.tmr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/logincheck")
    @ResponseBody
    public String loginCheck(String[] list, HttpSession session, Model model){
        String phoneNumber=list[0];
        User user=userService.selectByPhoneNumber(phoneNumber);
        if (user!=null&&user.getPassword().equals(list[1])){
            session.setAttribute("user",user);
            return "success";
        }
        model.addAttribute("msg","用户名或密码错误");
        return "false";
    }

    @RequestMapping("/register")
    public String register(User user){
        userService.register(user);
        return "redirect:/index.jsp";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        if (session.getAttribute("user")!=null)
            session.removeAttribute("user");
        return "redirect:/index.jsp";
    }
}
