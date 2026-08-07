package com.oop3;

public class StudentGame {
    public static void main(String[] args) {

        // 1. 객체 생성 (heap 메모리)
        Student s1 = new Student();

        // 2. 참조 변수를 통해 객체에 접근해 값 할당
        s1.studentId = 1;
        s1.studentName = "홍길동";
        s1.address = "부산";

        // 3. 생성된 객체의 동작(method)를 호출
        s1.study();
        s1.breakTime();
        s1.showInfo();
        s1.test();
        s1.clean();

        System.out.println("-----------------");

        Student s2 = new Student();
        s2.studentId = 2;
        s2.studentName = "김일남";
        s2.address = "울산";

        s2.study();
        s2.breakTime();
        s2.showInfo();
        s2.test();
        s2.clean();

    }
}
