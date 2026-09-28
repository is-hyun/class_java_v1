package _oop_test.ch07;

import java.util.ArrayList;
import java.util.List;

public class MusicDao {
    private List<Music> playlist = new ArrayList<>();

    public void insert(Music music) {
        playlist.add(music);
        System.out.println("[" + music.getTitle() + "] 곡이 플레이리스트에 추가되었습니다.");
    }

    public List<Music> findAll() {
        return playlist;
    }
}

