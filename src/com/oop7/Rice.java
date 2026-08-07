package com.oop7;

public class Rice {

    private String menu;
    private int amount;

    // 생성자
    public Rice(String m, int a) {
        menu = m;
        amount = a;
    }

    // 밥 먹기
    boolean eat(int eatAmount) {
        if (eatAmount <= amount) {
            amount -= eatAmount;
            System.out.println(amount);
            return true;
        }
        return false;
    }

}
