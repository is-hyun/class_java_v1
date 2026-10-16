package _design.builder;

public class MainTest1 {
    public static void main(String[] args) {

        // 빌더 패턴으로 클래스 생성
        Burger burger1 = new Burger.Builder()
                .bread("참깨빵")
                .patty("순쇠고기")
                .sauce("특별한 소스")
                .build();
        System.out.println(burger1);

        // !! 빌더 패턴에서 인수 순서는 관계 없으며, 일부만 작성 가능(넣지 않은 값은 null)
        Burger burger2 = new Burger.Builder()
                .patty("새우")
                .sauce("스파이시 어니언")
                .build();
        System.out.println(burger2);

    }
}
