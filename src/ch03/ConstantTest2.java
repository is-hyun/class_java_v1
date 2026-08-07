package ch03;

public class ConstantTest2 {
    public static void main(String[] args) {
        // 도전 과제 - 스스로 상수를 사용해서 값을 화면에 출력해 보세요

        // Answer. 최저시급을 상수로 지정하고 근로자 A, B에 대한 주급 계산
        final int PAY = 10320; // 최저시급(상수)
        int workTime_A = 15;
        int workTime_B = 11;

        int Pay_A = PAY * workTime_A;
        int Pay_B = PAY * workTime_B;

        System.out.println("근로자 A의 이번 주 수당은 : " + Pay_A + "원 입니다.");
        System.out.println("근로자 B의 이번 주 수당은 : " + Pay_B + "원 입니다.");


        // Answer. 환율 계산
        final double USD = 0.00068; // 달러 환율
        final double EUR = 0.00059; // 유로 환율

        int won_A = 685000;
        int won_B = 12324500;

        double USD_A = USD * won_A;
        double EUR_B = EUR * won_B;

        System.out.println("A는 " + won_A + "원을 " + USD_A + "달러로 환전했습니다.");
        System.out.println("B는 " + won_B + "원을 " + EUR_B + "달러로 환전했습니다.");
    }
}
