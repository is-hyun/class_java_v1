package _http.ch06;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TodoWriter {
    public static void main(String[] args) {

        // 자바 객체를 JSON 문자열로 변환
        Todo todo = new Todo();
        todo.setUserId(100);;
        todo.setId(400);;
        todo.setTitle("오늘은 총 복습을 해야 합니다");
        todo.setCompleted(false);

        Gson gson = new Gson();
        System.out.println(gson.toJson(todo));
        System.out.println();
        System.out.println("===== prettyPrinting으로 JSON 출력하기 =====");
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(prettyGson.toJson(todo));

    }
}
