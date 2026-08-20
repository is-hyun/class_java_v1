package _http.ch02;

import java.util.ArrayList;
import java.util.List;

public class JsonMaker {
    public static void main(String[] args) {

        String name = "홍길동";
        int age = 21;
        List<String> subjects = new ArrayList<>();
        subjects.add("수학");
        subjects.add("물리");
        subjects.add("컴퓨터 과학");

        // JSON 형식의 문자열로 출력
        String jsonStr = toJson(name, age, subjects);
        System.out.println(jsonStr);

    }

    // 학생 정보를 JSON 문자열로 조립하는 메서드
    public static String toJson(String name, int age, List<String> subjects) {
        StringBuilder sb = new StringBuilder();
        /*
        sb.append("{\n");
        sb.append("\t\"name\" : \"" + name + "\",\n");
        sb.append("\t\"age\" : \"" + age + "\",\n");
        sb.append("\t\"subjects\" : [\n");
        sb.append("\t\t\"" +subjects.get(0) + "\",\n");
        sb.append("\t\t\"" +subjects.get(1) + "\",\n");
        sb.append("\t\t\"" +subjects.get(2) + "\",\n");
        sb.append("\t]\n");
        sb.append("}\n");
         */

        sb.append("{\n");
        sb.append("\t\"name\" : \"").append(name).append("\",\n");
        sb.append("\t\"age\" : ").append(age).append(",\n");
        sb.append("\t\"subjects\" : [\n");
        for (int i = 0; i < subjects.size(); i++) {
            sb.append("\t\t\"").append(subjects.get(i)).append("\"");
            if (i < subjects.size() - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }
        sb.append("\t]\n");
        sb.append("}\n");

        return sb.toString();
    }
}
