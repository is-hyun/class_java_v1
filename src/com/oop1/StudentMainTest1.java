package com.oop1;

public class StudentMainTest1 {
    public static void main(String[] args) {

        // JVM(자바 가상 머신) 메모에 올릴 수 있다.
        Student  s1 = new Student(); // 클래스를 메모리에 올림(인스턴스 화)
        Student  s2 = new Student();

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);

        int grade = 10;
        double height = 1.1;

        System.out.println("grade : " + grade);
        System.out.println("height : " + height);

        // 자바에서 변수는 크게 2가지
        // 1. 기본 변수 : 실제 값이 저장
        // 2. 참조 변수 : 실제 값이 아닌 메모리의 주소 값이 저장

    }
}
