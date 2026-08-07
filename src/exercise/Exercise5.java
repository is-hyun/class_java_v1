package exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        int score = scanner.nextInt();

        //
        if (score < 0 || score >100) {
            System.out.println("잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요.");
            return;
        }

        char result = 'F';
        if (score >= 90 && score <= 100) {
            result = 'A';
            System.out.println("'" + result + "'학점: \"우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.\"");
        } else if (score >= 80 && score <= 90) {
            result = 'B';
            System.out.println("'" + result + "'학점: \"좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!\"");
        } else if (score >= 70 && score <= 80) {
            result = 'C';
            System.out.println("'" + result + "'학점: \"괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.\"");
        } else if (score >= 60 && score <= 70) {
            result = 'D';
            System.out.println("'" + result + "'학점: \"학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.\"");
        } else
            System.out.println("'" + result + "'학점: \"불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.\"");
    }
}
