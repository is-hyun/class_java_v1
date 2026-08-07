package com.oop4;

public class Bus {

    int busNumber;
    int money;
    // 기본 생성자 : public Bus() { }

    // 1. 사용자 정의 생성자
    public Bus(int n) {
        busNumber = n;
    }

    // 생성자는 여러 개 만들 수 있다. (= 생성자 오버로딩)
    public Bus(int n, int m) {
        busNumber = n;
        money = m;
    }

}
