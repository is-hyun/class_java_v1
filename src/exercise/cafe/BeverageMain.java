package exercise.cafe;

public class BeverageMain {
    public static void main(String[] args) {

        Beverage[] bev = new Beverage[5];

        bev[0] = new Americano();
        bev[1] = new Latte();

        int totalPrice = 0;
        for (int i = 0; i < bev.length; i++) {
            if (bev[i] == null) {
                break;
            }
            bev[i].prepare();
            bev[i].serve();
            totalPrice += bev[i].getPrice();
            System.out.println("-----------");
        }

        System.out.print("주문 : ");
        for (int i = 0; i < bev.length; i++) {
            if (bev[i] == null) {
                break;
            }
            System.out.print(bev[i].getName() + ", ");
        }
        System.out.println("\n총 금액 : " + totalPrice + "원");

    }
}
