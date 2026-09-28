package _oop_test.ch02;

public class BoardService {
    private BoardDAO boardDAO = new BoardDAO();
    public void writePost(String title, String content) {
        Board board = new Board(title, content);
        boardDAO.insertPost(board);
    }
}
