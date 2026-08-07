package useful.ch02;

public class ReplaceMain {
    public static void main(String[] args) {

        // replace()
        // 문자열 안에서 특정 문자나 문자열을 찾아 다른 값으로 변경(교체)한 문자열을 반환하는 메서드

        // 1. 원본 문자열은 바뀌지 않는다
        // 2. 일치하는 부분 전부 변경
        // 3. 두 가지 메서드 오버로딩이 존재


        // char 하나를 변경
        String fruit = "banana";
        String result1 = fruit.replace('a','o');
        System.out.println(result1);

        // 문자열 단위로 변경
        String string = "Hello World!";
        String newString = string.replace("World","Java");
        System.out.println(newString);

        // 활용
        String sen = "자바는 재미있다. 그러나 자바는 어렵기도 하다";
        String result2 = sen.replace("자바","Java");
        System.out.println(result2);

    }
}
