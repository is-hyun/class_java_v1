package useful.ch04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyHandling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("숫자를 입력하시오 ");
            int result = scanner.nextInt();
        } catch (InputMismatchException e2) {  // Exception이 최상위이므로 순서를 신경써야함
            System.out.println("입력을 잘못했습니다 (숫자)");
        } catch (Exception e) {
            System.out.println("알 수 없는 오류 발생");
        } finally {
            // 반드시 수행되어야 할 코드 영역
            // return 키워드를 만나도 무시하고 실행
            scanner.close();
        }

        System.out.println("-------------------");
        System.out.println("프로그램이 비정상 종료되지 않음");

    }
}
