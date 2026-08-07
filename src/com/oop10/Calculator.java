package com.oop10;

import java.util.Random;

public class Calculator {

    // 일반 인스턴스 메소드
    // - 객체를 생성해야 사용 가능
    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    // static 메소드
    // - 객체 생성 없이 클래스명.메소드명()으로 사용 가능
    // - 객체마다 결과가 달라질 이유가 없으므로 static 메서드가 적합
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    // main
    public static void main(String[] args) {
        System.out.println("여기에 별도로 main 실행 가능");
        // 클래스명.메서드명();
        Calculator.add(10,10); // 가능한 이유는 static 메모리에 위치하기 때문

        // 자바 표준 API
        double ran = Math.random(); // 클래스명.메서드명()의 형식으로 static 메서드이다.
        System.out.println("random : " + ran);

        // 자바 표준 API - Random
        Random random = new Random();
        int randomInt = random.nextInt();
        System.out.println("randomInt : " + randomInt);

        // 랜덤 범위 지정
        System.out.println(random.nextInt(45)); // 괄호 안에 범위 명시(0 ~ 44)
        System.out.println(random.nextInt(5) + 1); // 0을 제외하고 (1 ~ 5)


    }

}
