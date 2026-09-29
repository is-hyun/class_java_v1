package _oop_test.ch08;

import java.util.List;

public class OrderService {
    // 필드에 타입이 인터페이스 설계되어 있다.
    private OrderDao dao;

    public OrderService(OrderDao dao) {
        this.dao = dao;
    }

    public void takeOrder(String menuName, int price) {
        Order newOrder = new Order(menuName, price);
        dao.insert(newOrder);
    }

    public void printAllOrders() {
        List<Order> orders = dao.findAll();
        System.out.println("--- 전체 주문 내역 ---");
        for (Order order : orders) {
            System.out.println("메뉴: " + order.getMenuName() + " | 가격: " + order.getPrice() + "원");
        }
    }
}