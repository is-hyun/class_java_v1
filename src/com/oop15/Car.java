package com.oop15;

import com.oop14.C;

public class Car {

    private String name;
    private Engine engine;

    public Car(String name) {
        this.name = name;

        // 합성 조건 1.
        // 밖에서 받지 않고 생성자에서 직접 객체 생성
        // 즉, Car 객체 생성과 동시에 Engine 객체 생성
        this.engine = new Engine("v8");
    }

    // 합성 조건 2.
    // getEngine() 이 존재하면 않아야 함
    // 내부의 Engine 객체를 외부로 꺼내지 않아야 함

    //
    public void start() {
        engine.start();
        System.out.println(name + "가 출발합니다");
    }

    public void stop() {
        engine.stop();
        System.out.println(name + "이 정지합니다");
    }

}
