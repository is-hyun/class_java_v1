package useful.ch06;

import java.util.ArrayList;

public class GenericPrinterMain {
    public static void main(String[] args) {

        // 제네릭 프로그래밍을 활용하면 타입에 안정성을 부여해 컴파일 시 명확하게 파일을 지정할 수 있음

        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();

        // 즉, 코드를 사용하는 시점에 대체 문자열에 명확한 타입을 다시 지정할 수 있다
        GenericPrinter<Plastic> printer1 = new GenericPrinter();
        printer1.setMaterial(plastic1);
        System.out.println(printer1.getMaterial());
        // 다운캐스팅이 필요 없다 >> 즉, 타입에 안정성을 부여
        Plastic tempPlastic = printer1.getMaterial();

        // ! 핵심 - 변수명을 똑같이 사용해야 하는데 데이터 타입이 다양하게 처리되어야 할 때 제네릭 사용

        // 배열 <-- 컬렉션 프레임워크 (자료구조) --> 객체 배열 ArrayList 데이터 타임(제네릭 활용)
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(11);
        // list.add(10.5);  >> 오류 발생

    }
}
