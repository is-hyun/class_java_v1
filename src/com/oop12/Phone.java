package com.oop12;

public class Phone {

    private String name;
    private String number;

    public Phone (String name, String number) {
        this.name = name;
        this.number = number;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void showInfo() {
        System.out.println("---- 전화 번호 ----");
        System.out.println("이름 : " + name);
        System.out.println("번호 : " + number);
    }

}
