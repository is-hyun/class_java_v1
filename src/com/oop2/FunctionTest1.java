package com.oop2;

public class FunctionTest1 {

    // 함수 설계
    // 함수의 선언부
    static int add(int n1, int n2) {
        int result;
        result = n1 + n2;
        return  result; // input으로 받은 정수 2개를 연산해 결과값을 반환
    }

    public static void main(String[] args) {
        System.out.println("내가 설계한 함수를 사용해 보자");
        // 함수 이름 호출 그리고 모양 맞추기
        int result1 = add(10, 20);
        System.out.println("result 1 : " + result1);
    }

}
