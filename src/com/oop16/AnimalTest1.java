package com.oop16;

public class AnimalTest1 {
    public static void main(String[] args) {

        // 1. 자기 타입으로 바라보기
        Animal animal1 = new Animal();
        animal1.move();
        animal1.eating();
        System.out.println("----------------");

        // 2. 부모 타입으로 자식 객체 바라보기 (업캐스팅)
        Animal animal2 = new Tiger();
        animal2.move();
        animal2.eating();
        System.out.println("----------------");

        // 2.1 업캐스팅-Human
        Animal animal3 = new Human();
        animal3.move();
        animal3.eating();

        // 3. 문제 확인
        // Human 객체에는 reaBook() 메서드 호출 불가
        // animal.readBook() <-- 에러 : 실제 객체 Hunam 맞지만 컴파일 시점에 readBook() 호출 불가
        // 현재 부모 타입으로 바라보고 있기 때문

        // ! 핵심 - 컴파일 시점에는 타입만 바라보고 런타임 시점에는 실제 동작하는 객체의 행위가 실행

        Human human = (Human) animal3;  // 다운캐스팅
        human.readBook();               // 이제 Tiger 의 고유 메서드를 부를 수 있다
        ((Human) animal3).readBook();
    }
}
