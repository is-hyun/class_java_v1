package com.oop1;

public class WarriorMainTest {
    // main 함수 - JVM - Stack(메모리)
    public static void main(String[] args) {

        Warrior w1 = new Warrior();
        Warrior w2 = new Warrior();

        // w1 참조 변수에 접근해서 값을 할당
        // 1. 도트(.) 연산자를 통해 객체에 접근 가능
        w1.name = "전사";
        w1.height = 12.5;
        w1.health = 100;
        w1.attackPower = 70;
        w1.defensePower = 50;

        w2.name = "궁수";
        w2.height = 10.2;
        w2.health = 80;
        w2.attackPower = 60;
        w2.defensePower = 30;

        System.out.println("w1 이름 : " + w1.name);
        System.out.println("w1 키 : " + w1.height);
        System.out.println("w1 체력 : " + w1.health);
        System.out.println("w1 공격력 : " + w1.attackPower);
        System.out.println("w1 방어력 : " + w1.defensePower);

        System.out.println("-------------------------------------");

        System.out.println("w2 이름 : " + w2.name);
        System.out.println("w2 키 : " + w2.height);
        System.out.println("w2 체력 : " + w2.health);
        System.out.println("w2 공격력 : " + w2.attackPower);
        System.out.println("w2 방어력 : " + w2.defensePower);

    }
}

