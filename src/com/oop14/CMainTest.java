package com.oop14;

public class CMainTest {
    public static void main(String[] args) {

        C c = new C();
        // 물려 받지만 접근 제어자에 따라 접근 여부가 달라짐
        c.name = "홍길동";
        c.age = 15;
        c.height = 160;
        c.weight = 70;

        c.level = 1;
        c.nickName = "C";

        System.out.println(c.name + "\t" + c.age + "\t" + c.height + "\t" + c.weight);

    }
}
