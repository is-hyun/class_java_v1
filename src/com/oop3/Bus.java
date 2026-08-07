package com.oop3;

public class Bus {

    String name;
    int busNumber;
    int timeGap;

    void drive() {
        System.out.println("버스가 출발합니다.");
    }

    void stop() {
        System.out.println("버스가 정차합니다.");
    }

    void info() {
        System.out.println("버스 번호 : " + busNumber + "번");
        System.out.println("담당 기사 : " + name + " 기사님");
        System.out.println("배차 간격은 " + timeGap + "분 입니다.");
    }


}
