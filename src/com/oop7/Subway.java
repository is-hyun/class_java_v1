package com.oop7;

public class Subway {

    private int subLine;
    private int pay;

    // 생성자
    public Subway(int sl, int p) {
        subLine = sl;
        pay = p;
    }

    // 지하철 타기
    int getOn(int money) {
        if (money >= pay) {
            System.out.println("지하철을 탑니다.");
            return (money - pay);
        }
        System.out.println("잔액이 부족합니다.");
        return money;
    }

}
