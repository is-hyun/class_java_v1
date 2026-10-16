package _design.single;

// 1. 정적 변수 선언
// 2. private 생성자 선언
// 3. public 정적 메서드 선언
public class SingleTon {

    // 유일한 인스턴스를 저장할 변수 (private, static)
    private static SingleTon instance;

    // 생성자를 private로 선언, 외부에서 인스턴스화 할 수 없도록 제한
    private SingleTon() {}

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
