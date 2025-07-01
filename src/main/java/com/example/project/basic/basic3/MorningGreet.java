package com.example.project.basic.basic3;

//@Component
public class MorningGreet implements Greet{
    @Override
    public void greeting() {
        System.out.println("-------------");
        System.out.println("좋은 아침 입니다.");
        System.out.println("-------------");
    }
}

