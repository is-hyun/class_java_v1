package _design.adapter;

public class Cleaner implements IElectronic220v {

    @Override
    public void connect() {
        System.out.println("[청소기] : 콘센트 연결 (220V)");
    }
}
