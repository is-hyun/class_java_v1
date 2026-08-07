package com.oop10;

public class LottoGame {

    public static void main(String[] args) {

        int game1 = LottoNumberMaker.makeNum();
        int game2 = LottoNumberMaker.makeNum();
        int game3 = LottoNumberMaker.makeNum();
        int game4 = LottoNumberMaker.makeNum();
        int game5 = LottoNumberMaker.makeNum();
        int game6 = LottoNumberMaker.makeNum();

        System.out.println(game1 + "," + game2 + "," + game3 + "," + game4 + "," + game5 + "," + game6);

        // LottoNumberMaker 객체를 단 하나도 생성하지 않음.
        // 그래도 실행이 되는 이유는 makeNum이 static이기 때문이다.

    }

}
