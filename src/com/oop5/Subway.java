package com.oop5;

public class Subway {

    int lineNum;
    int count;
    int money;

    // 생성자
    public Subway(int num) {
        lineNum = num;
    }

    // 탑승
    void getOn(int pay) {
        money += pay;
        count++;
    }

    // 정보
    void showInfo() {
        System.out.println("지하철 노선 번호 : " + lineNum);
        System.out.println("현재 탑승 승객 수 : " + count);
        System.out.println("현재 운영 수익금 : " + money);
    }

}
