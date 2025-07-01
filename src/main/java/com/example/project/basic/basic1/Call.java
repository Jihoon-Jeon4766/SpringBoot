package com.example.project.basic.basic1;

public class Call {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 5;

        AddCalc add = new AddCalc();
        SubCalc sub = new SubCalc();
        MulCalc mul = new MulCalc();
        DivCalc div = new DivCalc();

        //sout
        System.out.println("덧셈 계산결과는 " + add.addCalc(a, b) + " 입니다.");
        System.out.println("뺄셈 계산결과는 " + sub.subCalc(a, b) + " 입니다.");
        System.out.println("곱셈 계산결과는 " + mul.mulCalc(a, b) + " 입니다.");
        System.out.println("나눗셈 계산결과는 " + div.divCalc(a, b) + " 입니다.");
    }
}

