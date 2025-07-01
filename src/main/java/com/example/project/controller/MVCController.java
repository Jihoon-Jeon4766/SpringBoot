package com.example.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {

    @GetMapping("/hello")
    public String helloWorld(Model model){
        model.addAttribute("USERNAME" , "JIHOON");
        return "hi";
    }

    @GetMapping("/bye")
    public String byewWorld(Model model){
        model.addAttribute("USERNAME1" ,"JUN");
        return "bye";
    }
}
