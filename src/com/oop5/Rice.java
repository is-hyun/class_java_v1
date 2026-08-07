package com.oop5;

public class Rice {

    String menu;
    int amount;

    public Rice(String name, int a) {
        menu = name;
        amount = a;
    }

    // 먹은만큼 줄어듬 (t,f)
    boolean eat(int eatAmount) {
        if (amount >= eatAmount) {
            amount -= eatAmount;
            return true;
        }
        return false;
    }


    // showInfo
    void showInfo() {
        System.out.println("메뉴 : " + menu);
        System.out.println("");
    }


}
