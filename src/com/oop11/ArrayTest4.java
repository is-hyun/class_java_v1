package com.oop11;

public class ArrayTest4 {
    public static void main(String[] args) {

        // 문자열 배열
        String[] names = new String[10];

        // 인덱스 연산자로 초기화
        names[0] = "김씨";
        names[1] = "나씨";
        names[2] = "박씨";
        names[9] = "최씨";

        // 배열의 길이와 요소의 개수는 동일하지 않다.
        // 요소만 출력하도록 코드를 수정
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i]);
            }
        }


    }
}
