package com.oop13;

public class Calculator {

    // 정수 덧셈 메서드
    public int add(int a, int b) {
        return a + b;
    }

    // 실수 덧셈 메서드
    // >> 매개변수 타입이 다름
    public double add(double a, double b) {
        return a + b;
    }

    // 세 정수의 덧셈 메서드
    // >> 매개변수 개수가 다름
    public int add(int a, int b, int c) {
        return a + b+ c;
    }


    public double add(double a, int b) {
        return a + b;
    }

    // 매개변수의 순서가 다름
    public double add(int a, double b) {
        return a + b;
    }


    public static void main(String[] args) {

        // println도 출력하는 값에 따라 같은 이름의 메서드가 여러 개 존재하는 오버로딩 가법
        System.out.println(1);
        System.out.println(1.0);
        System.out.println(true);
        System.out.println("String");

        // printlnInt() | printlnDouble() | printlnBoolean() --> println()으로 통일화
        // println( 1 + "String" )  ->  연산 결과가 String

    }

}
