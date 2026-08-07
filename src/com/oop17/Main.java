package com.oop17;

public class Main {
    public static void main(String[] args) {

        Fruit[] fruits = new Fruit[3];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Apple();

        // 타입 검사 필요 없음
        // 새 과일 타입이 추가되더라도 if문 작성 필요 없음
        for (int i = 0; i < fruits.length; i++) {
            fruits[i].showInfo();
            fruits[i].sale();
            System.out.println("------------");
        }

    }
}
