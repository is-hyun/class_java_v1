package ch05;

/*
 * 복합 대입 연산자
 * 대입 연산자와 다른 연산자가 함께 쓰이는 것
 */
public class Operation3 {
    public static void main(String[] args) {
        int n1 = 100;
        n1 = n1 + 1; // 대입 연산자는 우측 -> 좌측 순으로 진행되므로 +1을 계산 후 n1에 대입
        System.out.println(n1); // 101 출력

        n1 = n1 + 1; // 기존 값에서 +1
        n1 = n1 + 1;
        System.out.println("-----------------------");

        // 과정을 간소화하기 위해 복합 대입 연산자를 활용
        // 시작값 설정
        int score = 10;

        // 1. 점수 추가
        // score = score + 3
        score += 3; // 복합 대입 연산자
        System.out.println("농구 점수 3점 추가 " + score);

        // 2. 점수 감점
        score -= 3;
        System.out.println("농구 점수 3점 감점 " + score);

        // 3. 점수 두 배 증가
        score *= 2;
        System.out.println(score);

        // 4. 점수 반으로 감소
        score /= 2;
        System.out.println(score);

        // 5. 점수에 대한 나머지 연산
        score %= 3;
        System.out.println(score); // 10 % 3 = 1
    }
}
