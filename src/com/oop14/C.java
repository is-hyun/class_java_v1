package com.oop14;

// 상속을 사용할 때 extends 사용
public class C extends A {

    // 보이지 않지만 자동으로 A 클래스에 선언된 필드를 물려받는다.
    // 단, 접근 제어 지시자는 그대로 동작한다.

    int level;
    String nickName;

}
