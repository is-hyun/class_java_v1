package com.oop5;

public class Bus {

    int busNum;
    int count;
    int income;

    // 멤버 변수를 생성자를 통해서 초기화 하지 않는다면 자동을 기본값 부여.
    // (int 0, double 0.0, boolean false, String null)
    public Bus(int num) {
        busNum = num;
    }

    // 탑승
    void getOn(int pay) {
        income += pay;
        count++;
    }


    // 현재 상태
    void showInfo() {
        System.out.println("버스 번호 : " + busNum + "번");
        System.out.println("현재 승객 수 : " + count + "명");
        System.out.println("현재 총 수입 : " + income + "원");
    }

}
