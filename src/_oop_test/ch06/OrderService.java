package _oop_test.ch06;

import _oop_test.ch05.Item;

import java.util.List;

public class OrderService {
    private OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void takeOrder(String menuName, int price) {
        Order order = new Order(menuName, price);
        orderDao.insert(order);;
    }

    public void printAllOrders() {
        List<Order> orders = orderDao.findAll();
        for (Order order : orders){
            System.out.println("메뉴 : " + order.getMenuName() + " | 가격 : " +order.getPrice());
        }
    }
}
