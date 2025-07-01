package com.example.project.controller;

//이름과 나이를 모델에 저장하시오!

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class MustacheController {

    @GetMapping("/example1")
    public String example1(Model model) {
        model.addAttribute("NAME", "전지훈");
        model.addAttribute("AGE", "25");
        return "examples/example1";
    }

    //변수 isLogin 값 true > model 저장
    //뷰 템플릿에서 로그인 상태 입니다! vs 로그인 해주세요~

    @GetMapping("/example2")
    public String example2(Model model) {
        model.addAttribute("isLogin", false);
        return "examples/example2";
    }

    //foods = [{"foodname" : "햄버거"}, {"foodname": "피자"}, {"foodname": "치킨"}]

    @GetMapping("/example3")
    public String example3(Model model) {

//        List<Map<String,String>> foods = new ArrayList<>();

//        Map<String,String> food1 = new HashMap<>();
//        food1.put("foodname","햄버거");
//
//        Map<String,String> food2 = new HashMap<>();
//        food2.put("foodname","피자");
//
//        Map<String,String> food3 = new HashMap<>();
//        food3.put("foodname","치킨");

//        foods.add(food1);
//        foods.add(food2);
//        foods.add(food3);


        List<Map<String, String>> foods = List.of(
                Map.of("foodname", "햄버거"),
                Map.of("foodname", "피자"),
                Map.of("foodname", "치킨")
        );

        for (Map<String, String> food : foods) {
            System.out.println(food);
        }

        model.addAttribute("foods", foods);

        return "examples/example3";
    }

    //user = {"name": "이름", "email" : "이메일 주소"}
    //이름
    //이메일 주소 나오게 출력

    @GetMapping("/example4")
    public String example4(Model model) {

        Map<String, String> user = Map.of("name", "전지훈", "email", "ejjdj8eewj@gamil.com");

        model.addAttribute("user", user);

        return "examples/example4";
    }

    @GetMapping("/example5")
    public String example5(Model model) {

        model.addAttribute("content", "이곳은 본문 입니다.");

        return "examples/example5";
    }

    //이건 보임
    //이건 안 보임
    @GetMapping("/example6")
    public String example6(Model model) {
        return "/examples/example6";
    }

    //htmlContent 변수 선언 및 <strong> 지훈님! 환영합니다. </strong>
    @GetMapping("/example7")
    public String example7(Model model) {
        model.addAttribute("htmlContent", "<strong> 환영합니다. </strong>");

        return "/examples/example7";
    }
}
