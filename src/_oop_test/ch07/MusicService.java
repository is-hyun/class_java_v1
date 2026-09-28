package _oop_test.ch07;

import java.util.List;

public class MusicService {
    MusicDao dao;

    public MusicService(MusicDao dao) {
        this.dao = dao;
    }

    public void addMusic(String title, String artist) {
        Music music = new Music(title, artist);
        dao.insert(music);
    }

    public void printPlaylist() {
        List<Music> musics =  dao.findAll();
        System.out.println("==== 전체 플레이리스트 ====");
        for (Music music : musics) {
            System.out.println("\"" + music.getTitle() + "\" - " + music.getArtist());
        }
    }
}
