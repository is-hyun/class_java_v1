package com.oop9;

public class WarriorMainTest {
    public static void main(String[] args) {

        Warrior w1 = new Warrior("광전사");
        Warrior w2 = new Warrior("일반전사");
        w1.levelUp();
        // Warrior의 멤버 변수들의 접근 제어자는 private -> main에서 접근 불가능
        // 외부에서 값을 확인할 필요가 있을 때
        // 클래스 내부에서 getter, setter 메서드를 설계해서 외부 사용자가 활용 가능하게 함

        // getter, setter 확인
        w1.setHp(80);
        w1.setLevel(2);
        w1.setName("작은전사");
        System.out.println("----------");
        System.out.println(w1.getHp());
        System.out.println(w1.getLevel());
        System.out.println(w1.getName());

    }
}
