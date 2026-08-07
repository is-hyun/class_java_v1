package exercise.pay;

public class PayableMain {
    public static void main(String[] args) {

        FullTimeEmployee e1 = new FullTimeEmployee("김정규", 1001, 3200000);
        PartTimeEmployee e2 = new PartTimeEmployee("이알바", 2001, 10030, 80);

        e1.printInfo();
        System.out.println("급여 : " + e1.calculatePay() + "원");
        System.out.println("-----------");
        e2.printInfo();
        System.out.println("급여 : " + e2.calculatePay() + "원");

    }
}
