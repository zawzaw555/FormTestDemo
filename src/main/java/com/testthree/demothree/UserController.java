package com.testthree.demothree;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("msg","Hello Guest");
        return "/users/login";
    }

    @GetMapping("/detail")
    public String getMethodName(
        @RequestParam String name,
        @RequestParam String phone,
        @RequestParam String email,
        @RequestParam String password,
        Model model ) {   
            model.addAttribute("name", name);
            model.addAttribute("phone", phone);
            model.addAttribute("email", email);
            model.addAttribute("password", password);           
            return "users/detail";
    }

}
