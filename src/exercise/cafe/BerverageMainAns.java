package exercise.cafe;

public class BerverageMainAns {
    public static void main(String[] args) {
        Beverage b1 = new Americano();
        Beverage b2 = new Latte();

        b1.prepare();
        b1.serve();

        System.out.println("-----");

        b2.prepare();
        b2.serve();

        System.out.println("-----");

        // getName(), getPrice() 는 이럴 때 쓴다
        System.out.println("주문 : " + b1.getName() + ", " + b2.getName());
        System.out.println("총 금액 : " + (b1.getPrice() + b2.getPrice()) + "원");
    }
}
