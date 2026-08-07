package com.oop19;

public abstract class Car {

    void startCart() {
        System.out.println("시동을 켭니다");
    }

    void turnOff() {
        System.out.println("시동을 끕니다");
    }

    abstract void drive();
    abstract void stop();

    // ! 핵심 : 이 메서드를 템플릿 메서드로 설계
    // 실행 흐름이 미리 정의되어 있음
    final public void run() {
        startCart();
        drive();
        stop();
        turnOff();
    }

}
