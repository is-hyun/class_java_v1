package com.oop10;

import java.util.Random;

public class LottoNumberMaker {

    // 난수 생성기 하나를 재사용
    private static Random random = new Random();

    // static 메서드 - 1 ~ 45 사이의 번호를 만들어 반환한다.
    public static int makeNum() {
        return random.nextInt(45) + 1;
    }

}
