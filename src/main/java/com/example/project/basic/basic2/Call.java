package com.example.project.basic.basic2;

public class Call {

    public static void main(String[] args) {

        AddCalc add = new AddCalc();
        Integer resultAdd = add.calc(10,5);

        SubCalc sub = new SubCalc();
        DivCalc div = new DivCalc();
        MulCalc mul = new MulCalc();

        System.out.println("a+b = (" + resultAdd + ") 입니다.");

        System.out.println("a-b = "+ sub.calc(10,5));
        System.out.println("a*b = "+ mul.calc(10,5));
        System.out.println("a/b = "+ div.calc(10,5));


    }
}
