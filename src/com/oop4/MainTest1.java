package com.oop4;

// 코드 실행 파일
public class MainTest1 {
    public static void main(String[] args) {
        // 기본 생성자를 사용해서 객체 생성 됨
        // Student s2 = new Student();
        // 주의! 하나의 사용자 정의 생성자를 만들었다면 기본 생성자는 자동으로 생성되지 않음.

        Student s1 = new Student(1, "홍길동", 3);
        s1.showInfo();
        // 도트 연산자를 통해 객체에 값을 할당하는 코드를 단축
        // 생성자 - 객체를 생성시키는 특별한 유형의 함수

    }
}
