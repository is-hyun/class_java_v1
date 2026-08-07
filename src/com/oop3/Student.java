package com.oop3;

public class Student {

    // 속성(필드)
    int studentId;
    String studentName;
    String address;

    // 행위
    void study() {
        System.out.println("학생이 공부를 합니다");
    }

    void breakTime() {
        System.out.println("학생이 휴식을 합니다");
    }

    void showInfo() {
        System.out.println("-------상태창-------");
        System.out.println("학생 ID : " + studentId);
        System.out.println("학생 이름 : " + studentName);
        System.out.println("학생 주소 : " + address);
    }

    void test() {
        System.out.println("학생이 시험을 칩니다.");
    }

    void clean() {
        System.out.println("학생이 청소를 합니다.");
    }

}
