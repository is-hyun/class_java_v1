package com.oop4;

public class CoffeeMachineTest {
    public static void main(String[] args) {

        CoffeeMachine cm = new CoffeeMachine(300,20);

        String r1 = cm.makeCoffee();
        System.out.println("커피 요청 결과 : " + r1); // 초기값 -> 물과 원두 부족

        // 재료 채우기
        cm.fillWater(400);
        cm.fillBean(50);

        String r2 = cm.makeCoffee();
        System.out.println("재료 추가 후 재요청 결과 : " + r2);

        String r3 = cm.makeCoffee();
        System.out.println("머신 사용 후 재요청 결과 : " + r3);

        cm.showInfo();
        System.out.println(cm.countCoffee());

    }
}
