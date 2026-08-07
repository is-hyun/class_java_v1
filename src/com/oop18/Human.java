package com.oop18;

public class Human extends Animal {
    // 부모의 추상 메서드도 상속받은 상태
    // 부모가 추상 클래스라면 자식도 추상 클래스여야 한다
    // 추상 메서드를 일반 구현 메서드로 재정의하면 자식 클래스에서 추상 메서드 제거

    @Override
    public void hunt() {
        System.out.println("사람이 도끼로 사냥을 합니다");
    }

    public static void main(String[] args) {
        Animal animal = new Human();
        animal.hunt();
    }
}
