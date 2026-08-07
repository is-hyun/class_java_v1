package com.oop14;

public class Warrior extends Hero{

    // 부모 클래스의 생성자와 형식 맞춰야 함
    public Warrior(String name, int hp) {
        super(name, hp);
    }

    void comboAttack() {
        System.out.println("콤보 공격을 합니다");
    }
}
