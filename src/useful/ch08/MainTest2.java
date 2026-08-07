package useful.ch08;

public class MainTest2 {
    public static void main(String[] args) {

        // 외부에서 들어오는 값은 보통 문자열로 취급되는 경우가 많다
        // 예. 스캐너, 통신 등
        String str1 = "10A";
        String str2 = "20.5";
        String str3 = "true";

        // System.out.println("10" + 100);
        try {
            int n1 = Integer.parseInt(str1);
            System.out.println(n1 + 100);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 값입니다");
        }

        double d = Double.parseDouble(str2);
        System.out.println(d + 0.5);

        boolean b = Boolean.parseBoolean(str3);
        System.out.println(!b);

    }
}
