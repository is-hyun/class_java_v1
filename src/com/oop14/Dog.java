package com.oop14;

public class Dog extends Animal {

    @Override
    void eat() {
        super.eat(); // 부모 클래스 메서드 실행
        System.out.println("강아지가 밥을 먹습니다");
    }
}
