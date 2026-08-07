package com.oop10;

public class StaticRuleTest {

    private String version = "1.0.0";
    private static String appName = "로또 번호 생성기";

    // 인스턴스 메서드
    public String getVersion() {
        System.out.println(appName);
        System.out.println(version);
        return version;
    }

    // static 메서드
    public static String makeMessage() {
        System.out.println(appName);
        // System.out.println(version); // 인스턴스 변수는 static 메서드에서 참조 불가능
        return appName + " 입니다.";
    }
}
