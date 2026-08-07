package com.oop5;

public class Student {

    String name;
    int money;

    public Student(String n, int m) {
        name = n;
        money = m;
    }

    // 버스 탑승
    void takeBus(Bus bus) {
        // Bus 클래스에 작성된 getOn() 메소드에 접근
        System.out.println("버스 탑승");
        bus.getOn(1000);
        money -= 1000;
    }

    // 지하철 탑승
    void takeSub(Subway subway) {
        System.out.println("지하철 탑승");
        subway.getOn(1200);
        money -= 1200;
    }

    // 밥
    void eatRice(Rice rice) {
        if (rice.eat(100)) {  // --> T/F 값 반환
            System.out.println("밥을 먹었습니다.");
            return;
        }
        System.out.println("양이 부족해서 밥을 먹지 못했습니다.");
        // CoffeeMachine과 달리 if문 안에 return이 없었기 때문에
        // else나 return이 없으면 true 일 때 둘 다 출력되는 오류 발생
    }

    // 현재 상태
    void showInfo() {
        System.out.println(name + "님의 현재 잔액은 " + money + "원 입니다.");
    }
}
