package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String ShowIndex(){
        return "index";
    }
    @GetMapping("/gal")
    public String gallery(){
        return "gallery";
    }
    @GetMapping("/gulab")
    public String golba(){
        return "GolabJamun";
    }
    @GetMapping("/injera")
    public String Injera(){
        return "injera";
    }
    @GetMapping("/jerk")
    public String Jerk(){
        return "Jerk";
    }
    @GetMapping("/bara")
    public String Bara(){
        return "bara";
    }
    @GetMapping("/croque")
    public String Croque(){
        return "croque";
    }
    @GetMapping("/pumpkin")
    public String Pumpkin(){
        return "pumpkin";
    }
}
