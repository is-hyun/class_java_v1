package com.oop16;

public class Apple extends Fruit {

    public Apple() {
        name = "사과";
        price = 3000;
    }

    public void saleApple() {
        int discount = price / 10;
        price -= discount;
        System.out.println("사과 10% 할인 가격 : " + price);
    }

}
