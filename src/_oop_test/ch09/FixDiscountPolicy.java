package _oop_test.ch09;

public class FixDiscountPolicy implements DiscountPolicy {
    private int discountAmount = 1000;
    @Override
    public int discount(int price) {
        return discountAmount;
    }

}
