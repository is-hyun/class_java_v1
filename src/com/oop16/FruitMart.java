package com.oop16;

import com.oop14.A;

public class FruitMart {
    public static void main(String[] args) {

        Banana[] bananas = new Banana[10];
        bananas[0] = new Banana();
        bananas[1] = new Banana();

        Peach[] peaches = new Peach[3];
        peaches[0] = new Peach();
        peaches[1] = new Peach();
        peaches[2] = new Peach();

        // 결론 : 다형성이 없다면 타입별로 배열을 따로 생성
        System.out.println("----------------");

        // 다형성을 사용하면 부모 타입 배열 하나에 자식들을 모두 담을 수 있다
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Apple();

        for (int i = 0; i < fruits.length; i++) {
            fruits[i].showInfo();
            if (fruits[i] instanceof Banana) {
                ((Banana) fruits[i]).saleBanana();
            } else if (fruits[i] instanceof Apple) {
                ((Apple) fruits[i]).saleApple();
            }
        }

    }
}
