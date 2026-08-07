package com.oop11;

public class ArrayTest3 {
    public static void main(String[] args) {

        char[] alphabets = new char[26];
        char ch1 = 'A';
        alphabets[0] = ch1; // 배열에 변수 대입

        char ch2 = 'B';
        alphabets[1] = ch2;

        char ch3 = 'C';
        alphabets[2] = ch3;

        char ch26 = 'Z';
        alphabets[25] = ch26;

        System.out.println(alphabets[0]);
        System.out.println(alphabets[1]);
        System.out.println(alphabets[2]);

        System.out.println("-----------");

        // 배열은 반복문과 함께 사용하는 경우가 많다
        int forCount = 0;
        for (int i = 0; i < alphabets.length; i++) {
            System.out.println(alphabets[i]);
            forCount++;
        }
        System.out.println();
        System.out.println("for 동작 횟수 : " + forCount);

        // ! 배열의 길이와 배열의 요소(값이 할당된 부분) 개수는 다를 수 있다.

        // 추가) for문으로 A-Z 자동 할당
        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = (char)(65 + i);
            System.out.println(alphabets[i]);
        }

    }
}
