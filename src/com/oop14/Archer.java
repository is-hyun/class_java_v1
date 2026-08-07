package com.oop14;

public class Archer extends Hero {

    public Archer(String name, int hp) {
        super(name, hp);
    }

    void freezing() {
        System.out.println("궁수가 활을 쏩니다");
    }

}
