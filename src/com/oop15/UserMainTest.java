package com.oop15;

public class UserMainTest {
    public static void main(String[] args) {

        // 1. To-do 객체와 User 객체는 서로 몰라돋 각자 생성이 된다.
        Todo todo = new Todo("자바 복습");
        User user = new User(1, "홍길동");

        // 2. 아직 투두와 유저는 연결되지 않은 상태 - to-do 필드는 null 상태임
        user.displayMyTask();
        System.out.println("----------------------");

        // 3. 연관 관계 형성 - user가 to-do의 주소값을 갖게 된다.
        user.setTodo(todo);
        user.displayMyTask();
        System.out.println("----------------------");

        // 4. to-do 참조 변수를 통해서 상태를 바꾸기 (!중요)
        todo.setCompleted(true);

        // 5. 연관관계이기 때문에 user를 통해 조회해도 바뀐 상태가 보인다
        // 즉, 복사본이 아니라 같은 객체 하나를 함께 가리키고 있다
        user.displayMyTask();


    }
}
