package exercise.cafe;

public abstract class Beverage {

    private String name;
    private int price;

    public Beverage(String name, int price) {
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

    // 추상 메서드
    public abstract void prepare();

    // 일반 메서드
    public void serve() {
        System.out.println(name + " 나왔습니다. 가격은 " + price + "원 입니다.");
    }
}
