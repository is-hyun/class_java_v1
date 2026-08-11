package useful.ch16;

import java.util.Scanner;

@FunctionalInterface
interface BiggerOne {
    int bigger(int x, int y);
}


public class Demo6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 수를 입력하세요 : ");
        int num2 = sc.nextInt();

        BiggerOne result = (int x, int y) -> {
            if (x == y) {
                System.out.println("! 두 수가 서로 같습니다.");
            }
            return num1 > num2 ? num1 : num2;
        };

        System.out.println("둘 중 더 큰 수는 : " + result.bigger(num1, num2));

    }
}
