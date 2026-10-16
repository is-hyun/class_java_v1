package _design.adapter;

public class MyHouse {

    // 220V 콘센트에 전자기기를 연결하는 메서드
    public static void plugIn(IElectronic220v device) {
        device.connect();
    }

    // 테스트
    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner();
        HairDryer hairDryer = new HairDryer();
        ElectronicAdapter adapter = new ElectronicAdapter(hairDryer);
        plugIn(cleaner);
        //plugIn(hairDryer); // 규격이 맞지 않아 사용 불가
        plugIn(adapter);
    }
}
