package com.oop9;

public class DogMainTest {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.setName("포메라니안");
        dog1.setage(3);
        dog1.setWeight(2.7);

        System.out.println(dog1.getName());

        dog2.setName("푸들");
        dog2.setage(6);
        dog2.setWeight(3.5);

    }
}
