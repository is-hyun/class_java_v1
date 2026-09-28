package _oop_test.ch06;

public class Main {
    public static void main(String[] args) {
        OrderDao orderDao = new OrderDao();
        OrderService os = new OrderService(orderDao);
        os.takeOrder("아메리카노", 4500);
        os.takeOrder("카페라떼", 5000);
        os.takeOrder("바닐라라떼", 5500);
        os.printAllOrders();
    }
}
