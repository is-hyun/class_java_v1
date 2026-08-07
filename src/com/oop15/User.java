package com.oop15;

public class User {

    private int id;
    private String name;

    // 연관 관계 : User 는 To-do 객체의 주소값을 담을 수 있는 참조 변수를 가진다.
    private Todo todo;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        // To-do는 초기화 하지 않았으므로 null 상태
        // 참조 타입 필드의 기본값은 null이다.
    }

    // 할 일을 할당 받는 메서드 (연관 관계 형성)
    public void setTodo(Todo todo) {
        this.todo = todo;
    }
    // 필드에 가지고 있어야 연관 관계

    public void displayMyTask() {
        System.out.println(id + "번 " + name + " 님의 현재 할 일 정보");
        if (todo == null) {
            System.out.println("현재 등록된 할 일이 없습니다");
        } else {
            // 연관된 To-do 객체의 메서드를 호출
            todo.showInfo();
        }
    }

}
