package _oop_test.ch03;

public class Product {
    private String name;
    private int price;

    // 생성자
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // getter
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
