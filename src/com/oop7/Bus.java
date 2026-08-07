package com.oop7;

public class Bus {

    private int busNum;
    private int pay;

    // 생성자
    public Bus(int bn, int p) {
        busNum = bn;
        pay = p;
    }

    // 버스 타기
    boolean getOn(int money) {
        if (money >= pay) {
            System.out.println("버스를 탑니다.");
            return true;
        }
        System.out.println("잔액이 부족합니다.");
        return false;
    }

}
