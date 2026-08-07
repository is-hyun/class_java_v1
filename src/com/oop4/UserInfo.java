package com.oop4;

public class UserInfo {

    String userId;
    String userPassWord;
    String userName;
    String userAddress;
    String phoneNumber;

    // 생성자 오버로딩 연습
    // 객체 생성 시 가장 먼저 실행되는 부분은 생성자이다.
    public UserInfo(String id) {
        userId = id;
        // userId = userId; 멤버 변수와 매개 변수는 구분해주어야 한다
    }

    public UserInfo(String u, String password) {
        userId = u;
        userPassWord = password;
    }

    public UserInfo(String u, String password, String n) {
        userId = u;
        userPassWord = password;
        userName = n;
    }

    public UserInfo(String u, String password, String n, String a) {
        userId = u;
        userPassWord = password;
        userName = n;
        userAddress = a;
    }

    public UserInfo(String u, String password, String n, String a, String p) {
        userId = u;
        userPassWord = password;
        userName = n;
        userAddress = a;
        phoneNumber = p;
    }

}
