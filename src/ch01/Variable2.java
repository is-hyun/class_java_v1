package ch01;

/*
 * 복습 : 변수란 값을 담을 수 있는 메모리 상자
 * [변수의 사용 조건]
 * 1. 변수의 선언
 * 2. 변수에 값 대입
 * 3. 변수에 접근(변수명을 통해 호출)
 * */
public class Variable2 {
    // Ctrl + space : 단축 커맨드 창
    // 메인 함수 (실행의 시작점)
    public static void main(String[] args) {
        // 변수명을 작성할 때 규칙이 존재

        // 1. 대소문자를 명확히 구분하며 길이에 제한이 없다.
        int age = 10; // 변수의 선언과 동시에 초기화(값을 대입)
        // int age = 20; 같은 중괄호{ } 영역 내에서 동일한 변수명으로 선언 불가

        int aGe = 10; // 대소문자 구분으로 사용 가능
        int aGE = 10;

        // 2. 자바에서 기본제공하는 예약어는 변수명으로 사용할 수 없다.
        // int, double, for, while, List 등 (자바 내에서 미리 선점되어 있는 단어)
        // int for = 10; 변수명에 사용된 예약어 for에 의한 오류

        // 3. 특수문자는 _(언더바), $(달러) 표기만 사용 가능하다.
        int _count = 10;
        // int *count = 10; 사용 불가능한 특수문자 *에 의한 오류

        int $_tel = 10; // 사용 가능한 특수문자는 중복으로 사용 가능
        int tle_count_$age;

    } // end of main
} // end of class
