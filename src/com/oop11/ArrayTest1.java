package com.oop11;

public class ArrayTest1 {
    public static void main(String[] args) {

        // 배열(Array) - 연관된 데이터를 모아 한 번에 관리하기 위한 데이터 타입
        // 즉, 변수가 하나의 데이터를 저장한다면 배열은 여러 개의 데이터를 하나의 변수에 저장

        // 문법
        int[] intArr1 = new int[3]; // [][][]
        int intArr2[]; //= new int[3];
        // 둘 다 허용하는 문법이지만 int[]를 사용하는 문법을 권장
        // ! 배열 선언이 아닌 사용이라면, 배열의 길이를 반드시 지정해야 한다.

        intArr1[0] = 10;
        intArr1[1] = 20;
        intArr1[2] = 30;
        // [10][20][30]
        // intArr1[3] = 40; // >> 배열 길이 밖 (에디터에서 확인이 안되는 런타임시점 오류)
        // intArr1[3] = "가나다" // >> 다른 자료형 오류 (컴파일시점 오류)

        // int[] gradArray = new int[5];
        int[] gradArray = new int[]{1, 2, 3}; // [1][2][3]
        // >> 배열 선언과 동시에 값 초기화

        int[] gradArray2 = {2, 3, 4}; // [2][3][4]
        // >>new int[] 부분 생략 가능.

        //----------------------------------------

        // 길이 5만큼을 가지는 double 타입의 배열 선언
        double[] dArr1 = new double[5];
        dArr1[0] = 0.1; // [0.1][][][][]
        dArr1[1] = 0.2; //[0.1][0.2][][][]

        // ! 인덱스의 시작은 항상 반드시 0 부터 시작
        // ! 즉, 인덱스의 크기와 배열의 길이는 다르다
        // 인덱스의 크기 = 배열의 길이 n - 1
        // (예. 배열의 길이 : 30 >> 인덱스의 크기 29)

        //----------------------------------------

        // 1. char 배열 2개 선언해서 초기화
        char[] charArr = new char[2];
        charArr[0] = 'A';
        charArr[1] = 'B';

        // 2. boolean 배열 3개 선언해서 초기화
        boolean[] boolArr = new boolean[3];
        boolArr[0] = true;
        boolArr[2] = true; // [true][][false]

    }
}
