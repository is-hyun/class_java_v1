package com.oop11;

public class ArrayTest2 {
    public static void main(String[] args) {

        // 문자열 사용 방법
        String s1 = "안녕";
        String s2 = new String("안녕");

        // 문자열 배열
        String[] names = new String[5];

        // 인덱스 연산자로 초기화
        names[0] = "김씨";
        names[1] = "나씨";
        names[2] = "박씨";

        // 인덱스 연산자로 값 조회
        System.out.println(names); // >> 주소값 출력
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // 인덱스 연산자로 값 수정
        names[0] = "Mr Kim";
        names[1] = "Mr Na";
        names[2] = "Mr Park";

        // 인덱스 연산자로 값 삭제 (String의 기본 초기값 : null)
        // * 따로 값을 지정하지 않은 경우에 null로 출력 (String[] 해당)
        names[0] = null;
        names[1] = null;
        names[2] = null;

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        // 배열은 객체이기 때문에 도트(.) 연산자 사용 가능
        System.out.println(names.length);
        // 도트(.)연산자를 통해 배열 객체 내의 length 변수에 접근해 배열의 길이를 반환받음

        System.out.println("배열의 길이 : " + names.length);
        System.out.println("배열 인덱스 크기 : " + (names.length - 1));

    }
}
