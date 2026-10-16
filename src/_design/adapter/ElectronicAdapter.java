package _design.adapter;

// 어뎁터 클래스
// 110V를 받아서 220V으로 변환
public class ElectronicAdapter implements IElectronic220v{

    // 내부에서 110V용 메서드 실행
    // 1. 110V 타입 변수 선언
    private IElectronic110v iElectronic110v;

    // 2. 객체 생성자 - 생성자 호출 시 110V 인수로 220V 객체 생성
    public ElectronicAdapter(IElectronic110v iElectronic110v) {
        this.iElectronic110v = iElectronic110v;
    }

    // 3. 오버라이딩으로 인터페이스 메서드 구현
    @Override // 220V 인터페이스의 메서드를 수정
    public void connect() {
        System.out.println("----------------------------------------------");
        System.out.println("[ADAPTER] : 220V 규격에 맞게 전압을 변환합니다.");
        iElectronic110v.connect(); // 내부적으로 110V 메서드 호출
    }

    // ! 정리 ! 내부의 110V를 220V의 클래스로 감싸는 형태
}
