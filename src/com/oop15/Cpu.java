package com.oop15;

public class Cpu {

    private String name;

    public Cpu(String name) {
        this.name = name;
    }

    void start() {
        System.out.println(name + "을 실행합니다");
    }

    void stop() {
        System.out.println(name + "을 종료합니다");
    }

}
