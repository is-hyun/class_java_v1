package com.oop9;

public class Warrior {

    private String name;
    private int level;
    private int hp;

    public Warrior(String name) {
        this.name = name;
        level = 1;
        hp = 100;
    }

    // getter 메서드 (반환타입 : 멤버변수 자료형 / 매개변수 X)
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    // setter 메서드 (반환타임 : void / 매개변수 O )
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        if(level <= 0) {
            System.out.println("0보다 작은 값을 입력할 수 없습니다");
            return;
        }
        this.level = level;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            System.out.println("0보다 작은 값을 입력할 수 없습니다");
            return;
        }
        this.hp = hp;
    }


    public void levelUp() {
        level++;
        hp += 50;
        System.out.println(name + "의 현재 레벨은 " + level + "입니다.");
    }

}
