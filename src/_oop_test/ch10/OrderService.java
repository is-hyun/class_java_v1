package _oop_test.ch10;

import java.util.List;

public class OrderService {
    private DiscountPolicy discountPolicy;
    private OrderDao orderDao;

    public OrderService(OrderDao orderDao, DiscountPolicy discountPolicy) {
        this.orderDao = orderDao;
        this.discountPolicy = discountPolicy;
    }

    public void takeOrder(String menuName, int price){
        Order neworder = new Order(menuName, price);
        orderDao.insert(neworder);

        int discountAmount = discountPolicy.discount(neworder.getPrice());
        int finalPrice = neworder.getPrice() - discountAmount;
        System.out.println(neworder.getMenuName() + " | 정가 : " +
                neworder.getPrice() + "원 | 할인 : " + discountAmount + "원 | 최종 결제 금액 : " + finalPrice + "원\n" );
    }

    public void printAllOrders() {
        List<Order> orders = orderDao.findAll();
        System.out.println("--- 전체 주문 내역 ---");
        for (Order order : orders) {
            System.out.println("메뉴: " + order.getMenuName() + " | 가격: " + order.getPrice() + "원");
        }
    }
}
