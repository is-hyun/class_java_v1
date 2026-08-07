package com.oop4;

public class CoffeeMachine {

    // 커피 머신의 상태(필드) : 물의 양(ml), 커피 원두(g)
    int water;
    int coffee;
    int count = 0;

    // 생성자
    public CoffeeMachine(int w, int c) {
        water = w;
        coffee = c;
    }

    // 메소드 1. 물 채우기
    void fillWater(int amount) {
        if (amount >= 0) {
            water += amount;
            System.out.println("물을 " + amount + "ml 채웠습니다.");
        } else {
            System.out.println("0보다 많은 양의 물을 채워주세요.");
        }
    }

    // 메소드 2. 원두 채우기
    void fillBean(int amount) {
        if (amount >= 0) {
            coffee += amount;
            System.out.println("원두를 " + amount + "g 채웠습니다.");
        } else {
            System.out.println("0보다 많은 양의 원두를 채워주세요.");
        }
    }

    // 메소드 3. 커피 만들기
    String makeCoffee() {
        if (water >= 300 && coffee >= 20) {
            water -= 300;
            coffee -= 20;
            count++;
            return "커피 한 잔을 만들었습니다.";
        }

        if (water < 300) {
            if (coffee < 20) {
                return "물과 원두가 부족합니다.";
            }
            return "물이 부족합니다.";
        }
        return "원두가 부족합니다.";
    }

    // 메소드 4. 현재 상태값
    void showInfo() {
        System.out.println("--- 현재 재고 상태 ---");
        System.out.println("원두(g) : " + coffee);
        System.out.println("물(ml) : " + water);
    }

    // 메소드 5. 만든 커피 개수
    String countCoffee() {
        return "지금까지 만든 커피는 총 " + count + "잔 입니다.";
    }

}
