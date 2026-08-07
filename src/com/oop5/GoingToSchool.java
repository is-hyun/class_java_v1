package com.oop5;

public class GoingToSchool {
    public static void main(String[] args) {

        Bus bus123 = new Bus(123);
        Bus bus57 = new Bus(57);
        Subway line1 = new Subway(1);
        Student s1 = new Student("홍길동", 10000);
        Student s2 = new Student("김일남", 2000);
        Rice rice1 = new Rice("잡곡밥", 500);

        s1.takeBus(bus123);
        s2.takeBus(bus123);
        s1.eatRice(rice1);

    }
}
