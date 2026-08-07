package com.oop8;

public class Person {

    // this의 세 가지 사용 방법
    // 1. 자기 자신의 주소를 가리킴
    // 2. 생성자에서 다른 생성자를 호출
    // 3. 자기 자신의 주소값을 return 값으로 반환

    private String name;
    private int age;
    private String phone;
    private String gender;

    // 1.
    public Person(String name, int age) {
        // name = name;
        this.name = name;
        this.age = age;
    }

    // 2.
    public Person(String name, int age, String phone) {
        // this.name = name;
        // this.age = age;
        this(name, age); // 다른 생성자 호출 -> 중복되는 멤버 변수 주의
        this.phone = phone;
    }

    // 3.
    public Person(String name, int age, String phone, String gender) {
        // this.name = name;
        // this.age = age;
        // this.phone = phone;
        this(name, age, phone);
        this.gender = gender;
    }

    // 메소드를 통해서 자기 자신의 주소값을 반환시켜야 하는 경우 this 사용
    public Person getPerson() {
        return this;
    }

}