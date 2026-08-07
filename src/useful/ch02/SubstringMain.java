package useful.ch02;

public class SubstringMain {
    public static void main(String[] args) {

        // substring()
        // 문자열 안에서 지정한 구간을 잘라내어 새로운 문자열로 반환하는 메서드
        // H E L L O   W O R L D
        // 0 1 2 3 4 5 6 7 8 9 10  (공백 포함)

        String text = "HelloWorld";

        // 1. 시작 위치부터 끝까지 자르기
        System.out.println("substring(5) : " + text.substring(5));

        // 2. 시작 위치부터 (끝 위치 - 1) 까지
        String subResult = "Hello World".substring(2,8); // 2 ~ 7 출력
        System.out.println(subResult);

        // 3. 만들어져 있는 모양 맞추기
        System.out.println("substring(2, 6) : " + text.substring(2, 6));

        // ! 주의 - 런타임 시점 에러 (StringIndexOutOfBoundsException)
        System.out.println("substring(0, 20) : " + text.substring(0, 20)); // 원본 문자열 범위 밖
    }
}
