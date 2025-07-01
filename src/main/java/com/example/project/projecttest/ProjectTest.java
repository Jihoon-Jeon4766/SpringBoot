package com.example.project.projecttest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectTest {

    @GetMapping("/projecttest/test")
    public String TestWorld(Model model){

//        Random random = new Random();

        String [] NAME = {"뽀야미","애플이","오렌지"};
        String [] AGE = {"3살", "5살","40살(?)"};
        String [] character= {"나는 뽀야미","3243","나는 오렌지"};

//        String randName = String.valueOf(random.nextInt(NAME.length));
//        String randAge = String.valueOf(random.nextInt(AGE.length));
//        String randCharacter = String.valueOf(random.nextInt(character.length));

        int randInt = (int)(Math.random() * NAME.length);

        model.addAttribute("NAME" ,NAME[randInt]);
        model.addAttribute("AGE" ,AGE[randInt]);
        model.addAttribute("character" ,character[randInt]);

//        model.addAttribute("NAME" ,randName);
//        model.addAttribute("AGE" , randAge);
//        model.addAttribute("character" , randCharacter);
        return "projecttest/test";
    }

}
