package exercise;

public class Exercise3 {
    public static void main(String[] args) {
        // 할인된 가격을 화면에 출력하는 코드 작성
        // 할인율 30%

        final double ORIGINAL_PRICE = 59.99;
        final double DISCOUNT_RATE = 0.30; // 30% 할인율

        // 할인 적용 계산식
        double result = ORIGINAL_PRICE * (1 - DISCOUNT_RATE);

        // 할인된 계산 금액을 변수에 대입해 출력. 단, 정수값으로 출력
        System.out.println("할인된 최종 금액은 " + (int)result + "달러입니다.");



    }
}
