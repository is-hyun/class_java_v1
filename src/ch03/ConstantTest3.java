package ch03;

public class ConstantTest3 {
    public static void main(String[] args) {
        // 사각형의 면적을 구하는 코드를 작성해보세요. 단, 상수 활용
        final int SQUARE_WIDTH = 7; // 사각형 가로 길이
        final int SQUARE_HEIGHT = 7; // 사각형 세로 길이

        int areaSquare = SQUARE_HEIGHT * SQUARE_WIDTH;

        System.out.println("사각형의 면적은 : " + areaSquare);

    }
}
