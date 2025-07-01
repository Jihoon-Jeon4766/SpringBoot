package com.example.project.basic.basic5;

public class MemberServiceExample {

    public void register(String name){

        try{
            System.out.println("회원 가입 로직 수행 : " + name);

            if(name == null){
                throw  new IllegalArgumentException("이름이 null 일 수 없습니다.");
            }

        }catch (Exception e){
            System.out.println("에러 발생 :" + e.getMessage());
        }
    }
}
