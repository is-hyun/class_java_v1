package _oop_test.ch08;

import java.util.List;

public interface OrderDao {
    void insert(Order order);
    List<Order> findAll();
}