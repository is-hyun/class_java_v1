package _oop_test.ch02;

public class BoardDAO {

    public void insertPost(Board board) {
        System.out.println("제목 : [" + board.getTitle() + "] - 게시글이 DB에 등록되었습니다." );
    }
}
