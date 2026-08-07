package com.oop2;

public class FunctionTest2 {

    // 세 개의 수를 입력 받아 뺄셈하는 함수 설계
    static int sub(int a, int b, int c) {
        int result = a - b - c;
        return  result;
    }

    // return 필요 없는 함수
    static void sayHello(String greeting) {
        System.out.println("[[[ " + greeting + " ]]]");
    }

    // 매개변수(parameter)가 없는 함수
    static int calcSum() {
        // 지역 변수를 사용할 때는 초기화 필요
        int sum =0;
        int i;

        for(i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // 함수 호출 시 들어가는 값 : 인수 (10, 2, 3)
        int test = sub(10, 2, 3);
        int test2 = sub(num1, num2, 3);
        System.out.println(test);
        System.out.println(test2);
        System.out.println("--------------");

        sayHello("안녕 함수야 반가워");
        sayHello("안녕~ 홍길동");
        System.out.println("--------------");

        int result = calcSum();
        System.out.println(result);
    }

}
