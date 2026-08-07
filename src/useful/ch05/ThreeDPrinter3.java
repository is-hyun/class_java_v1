package useful.ch05;

public class ThreeDPrinter3 {

    // 재료
    Object material;

    // 재료 꺼내기
    public Object getMaterial() {
        return material;
    }

    // 재료 넣기
    public void setMaterial(Object material) {
        this.material = material;
    }


    // 테스트 코드 작성
    public static void main(String[] args) {

        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();

        ThreeDPrinter3 printer3 = new ThreeDPrinter3();
        printer3.setMaterial(plastic1);
        System.out.println(printer3.getMaterial());
        System.out.println("------------------------");
        printer3.setMaterial(powder1);
        System.out.println(printer3.getMaterial());

        // 타입을 선언해서 저장하기
        Powder tempPowder = (Powder) printer3.getMaterial(); // 강제 형변환 (다운캐스팅)

    }
}
