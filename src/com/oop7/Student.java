package com.oop7;

public class Student {

    private String name;
    private int money;

    // 생성자
    public Student(String n, int m) {
        name = n;
        money = m;
    }

    // 버스 타기
    void takeBus(Bus bus) {
        if(bus.getOn(money)) {
            money -= 1000;
        }
    }

    // 지하철 타기
    void takeSub(Subway sub) {
        money = sub.getOn(money);
    }

    // 밥 먹기
    void eatRice(Rice rice) {
        if (rice.eat(300)) {
            System.out.println("밥을 먹었습니다.");
        } else {
            System.out.println("양이 부족해서 먹을 수 없습니다.");
        }
    }

    // 상태
    void info() {
        System.out.println("이름 : " + name);
        System.out.println("현재 잔액 : " + money + "원");

    }

}
