package com.oop4;

public class CalculatorMain {

    // 두 숫자를 더하는 함수
    static int add(int a, int b) {
        return a + b;
    }

    // 두 숫자를 빼는 함수
    static int sub(int a, int b) {
        return a - b;
    }

    // 두 숫자를 곱하는 함수
    static int mul(int a, int b) {
        return a * b;
    }

    // 두 숫자를 나누는 함수
    static double div(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double)a / b;
    }

    // 짝수 판별 함수
    static boolean even(int num) {
        return num % 2 == 0;
    }

    // 홀수 판별 함수
    static boolean odd(int num) {
        return num % 2 != 0;
    }

    public static void main(String[] args) {
        //
        int r1 = add(2,3);
        int r2 = sub(11,4);
        int r3 = mul(7,5);
        double r4 = div(20,6);
        System.out.println("덧셈 : " + r1);
        System.out.println("뺄셈 : " + r2);
        System.out.println("곱셈 : " + r3);
        System.out.println("나눗셈 : " + r4);

        System.out.println("---------------------");

        boolean e1 = even(26);
        boolean e2 = even(19);
        System.out.println("짝수 : " + e1);
        System.out.println("짝수 : " + e2);
        boolean o1 = even(19);
        boolean o2 = even(6);
        System.out.println("홀수 : " + o1);
        System.out.println("홀수 : " + o2);

    }
}
