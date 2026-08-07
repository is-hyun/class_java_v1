package com.oop10;

public class MainTest1 {
    public static void main(String[] args) {

        Employee e1 = new Employee("홍길동", "인사부");
        Employee e2 = new Employee("김철수", "재무부");
        Employee e3 = new Employee("김영희", "홍보부");

        System.out.println(e1.employeeNumber);
        System.out.println(e2.getNumber());
        System.out.println(e3.getNumber());

    }
}
