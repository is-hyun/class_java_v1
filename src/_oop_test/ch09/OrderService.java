package _oop_test.ch09;

public class OrderService {
    private DiscountPolicy discountPolicy;

    public OrderService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public void takeOrder(String menuName, int price){
        Order neworder = new Order(menuName, price);
        int discountAmount = discountPolicy.discount(neworder.getPrice());
        int finalPrice = neworder.getPrice() - discountAmount;
        System.out.println(neworder.getMenuName() + " | 정가 : " +
                neworder.getPrice() + "원 | 할인 : " + discountAmount + "원 | 최종 결제 금액 : " + finalPrice + "원" );
    }
}
