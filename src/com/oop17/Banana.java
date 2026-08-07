package com.oop17;

public class Banana extends Fruit {

    private String origin;

    public Banana() {
        name = "바나나";
        price = 5000;
        origin = "필리핀";
    }

    // 정액 할인 - 1000원 할인
    @Override
    public void sale() {
        price -= 1000;
        System.out.println("할인된 바나나 가격 : " + price);
    }
}
