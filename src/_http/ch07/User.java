package _http.ch07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 데이터를 담는 클래스 DTO
// GSON은 자바 객체와 JSON 문자열을 서로 변경해주는 라이브러리
// 변경하기 위해서 담을 클래스가 먼저 준비되어야 한다

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    // 필드 이름이 곧 JSON의 키가 된다
    // {"id" : 1, "name" : "홍길동", "email" : "abc.naver.com"}
    private int id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}




