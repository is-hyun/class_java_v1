package _design.adapter;

public class HairDryer implements IElectronic110v{

    @Override
    public void connect() {
        System.out.println("[헤어드라이기] : 콘센트 연결 (110V)");
    }
}
