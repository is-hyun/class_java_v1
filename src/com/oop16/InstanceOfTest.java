package com.oop16;

public class InstanceOfTest {
    public static void main(String[] args) {

        Fruit f1 = new Peach();
        Fruit f2 = new Banana(); // 업캐스팅

        checkFruit(f1);
        System.out.println("-------------");
        checkFruit(f2);

    } // end of main

    public static void checkFruit(Fruit fruit) {
        // ! 캐스팅(형변환/다운캐스팅) 전에 반드시 확인
        if (fruit instanceof Banana) {
            System.out.println("바나나 타입입니다");

            // 다운캐스팅 (안전)
            Banana banana = (Banana) fruit;
            System.out.println("원산지 : " + banana.getOrigin());
            banana.saleBanana();

        } else if (fruit instanceof Peach) {
            System.out.println("복숭아 타입입니다");
        } else {
            System.out.println("알 수 없는 과일 타입입니다");
        }
    }

}
