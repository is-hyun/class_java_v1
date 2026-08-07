package useful.ch04;

public class ArrayExceptionHandling {
    public static void main(String[] args) {

        // 배열 선언과 동시에 초기화
        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i =0; i < 10; i++) {
                System.out.println("arr[" + i +"] = " + arr[i]);
            }
        } catch (Exception e) {
//             System.out.println("catch 블록으로 이동");
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }

//        for (int i =0; i < 10; i++) {
//            System.out.println("arr[" + i +"] = " + arr[i]);
//        }
//
//        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;

        System.out.println("프로그램이 비정상 종료되지 않음");

    }
}
