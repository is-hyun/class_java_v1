package com.oop15;

public class Todo {

    private String content;
    // 참고 - boolean 필드명에 관례상 is를 붙이지 않는다
    private boolean completed;

    public Todo(String content) {
        this.content = content;
    }

    // getter
    public String getContent() {
        return content;
    }

    // boolean 타입은 getter 명에 관례상 is 사용
    public boolean isCompleted() {
        return completed;
    }

    // setter - 단순 상태값만 변경
    // boolean 타입이라도 setter 에서는 is 사용 안함
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void showInfo() {
        String status;
        if (completed) {
            status = "[완료]";
        } else {
            status = "[미완료]";
        }
        System.out.println("할 일 : " + content + " , " + status);
    }

}
