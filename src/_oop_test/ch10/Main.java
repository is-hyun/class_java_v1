package _oop_test.ch10;

public class Main {
    public static void main(String[] args) {
        DiscountPolicy discountPolicy = new RatediscountPolicy();
        OrderDao orderDao = new MemoryOrderDao();
        OrderService orderService = new OrderService(orderDao, discountPolicy);

        orderService.takeOrder("아메리카노", 4500);
        orderService.takeOrder("카페 라떼", 5000);
        orderService.takeOrder("바닐라라떼", 5500);

        orderService.printAllOrders();
    }
}
