package com.testthree.demothree;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {
    @GetMapping("/error")
    public String getMethodName() {
        return "error";
    }
    
}
