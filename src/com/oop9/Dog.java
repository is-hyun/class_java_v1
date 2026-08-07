package com.oop9;

public class Dog {

    private String name;
    private int age;
    private double weight;

    // 1. get 메서드
    public String getName() {
        return name + " 강아지";
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // 2. set 메서드
    public void setName(String name) {
        this.name = name;
    }

    public void setage(int age) {
        if (age <= 0) {
            System.out.println("0보다 작은 값은 입력할 수 없습니다.");
        }
        this.age = age;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            System.out.println("0보다 작은 값은 입력할 수 없습니다.");
        }
        this.weight = weight;
    }

}
