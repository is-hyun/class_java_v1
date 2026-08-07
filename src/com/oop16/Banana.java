package com.oop16;

public class Banana extends Fruit {

    private String origin;

    public Banana() {
        name = "바나나";
        price = 5000;
        origin = "필리핀";
    }

    // getter
    public String getOrigin() {
        return origin;
    }

    // 정액 할인 - 고정값만큼 할인
    // Banana 고유 메서드
    public void saleBanana() {
        if (price <= 1000) {
            System.out.println("더 이상 할인할 수 없습니다");
            return;
        }
        price -= 1000;
        System.out.println("바나나 천 원 할인. 현재 가격 : " + price);
    }

}
