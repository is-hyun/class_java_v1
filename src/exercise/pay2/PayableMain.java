package exercise.pay2;

public class PayableMain {
    public static void main(String[] args) {

        FullTimeEmployee e1 = new FullTimeEmployee("김정규", 1001, 3200000);
        Employee e2 = new PartTimeEmployee("이알바", 2001, 10030, 80);
        FullTimeEmployee e3 = new Manager("박팀장", 1002, 4000000,500000);

        e1.printInfo();
        System.out.println("급여 : " + e1.calculatePay() + "원");
        System.out.println("보너스 : " + e1.calculateBonus() + "원");
        System.out.println("-----------");
        e2.printInfo();
        System.out.println("급여 : " + e2.calculatePay() + "원");
        System.out.println("-----------");
        e3.printInfo();
        System.out.println("급여 : " + e3.calculatePay() + "원");
        System.out.println("보너스 : " + e3.calculateBonus() + "원");

    }
}
