package com.example.project.basic.basic5;

import org.springframework.stereotype.Component;

@Component
public class MemberService {

    public void register(String name){

            System.out.println("회원 가입 로직 수행 : " + name);

            if(name == null){
                throw  new IllegalArgumentException("이름이 null 일 수 없습니다.");
            }

    }
}
