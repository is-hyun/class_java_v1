package com.oop14;

public class Customer {

    private int customerId;
    private String customerName;
    private String vustomerGrade;
    private int bonusPoint;
    private double bonusRatio;

    public Customer() {
        bonusRatio = 0.01;
    };

    public int clacPrice(int price) {
        System.out.println("적립");
        bonusPoint = (int)(price * bonusRatio);
        return bonusPoint;
    }

    public void showCustomerInfo() {
        System.out.println("고객 정보");
        System.out.println("");
    }

}
