package _oop_test.ch07;

public class Main {
    public static void main(String[] args) {
        MusicDao musicDao = new MusicDao();
        MusicService ms = new MusicService(musicDao);
        ms.addMusic("Shape of You", "Ed Sheeran");
        ms.addMusic("Blinding Lights", "The Weeknd");
        ms.addMusic("LOVE ATTACK", "리센느");

        ms.printPlaylist();
    }
}
