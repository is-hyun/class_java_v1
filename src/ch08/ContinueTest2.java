package ch08;

public class ContinueTest2 {
    public static void main(String[] args) {

        // 1층부터 15층까지 엘리베이터가 이동합니다.
        // 단, 4층은 층수를 세지 않고 건너뜁니다.\

        for (int floor = 1; floor <= 15; floor++) {
            if (floor == 4) {
                continue;
            }
            System.out.println(floor + "층 도착입니다.");
        }

    }
}
