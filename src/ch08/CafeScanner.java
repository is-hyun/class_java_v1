package ch08;

import java.util.Scanner;

public class CafeScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int price = 2500;

        while (true) {
            System.out.print("주문 수량을 입력하세요 : ");
            count = sc.nextInt();
            if (count > 0) {
                int total = price * count;
                System.out.println("총 주문 금액 : " + total + "원");
                if (count >= 3) {
                    System.out.println("3잔 이상 구매 시 특별 스탬프 지급");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
                break;
            } else {
                System.out.println("한 잔 이상 주문해야 합니다.");
                System.out.println();
            }
        }

    }
}
