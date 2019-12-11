package com.bogdanrotaru.myTunes.Service;

import com.bogdanrotaru.myTunes.Model.Song;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongService {


    public List<Song> getSongList() {
        List<Song> songList = new ArrayList<>();

        Song song = new Song();
        song.setId(1);
        song.setArtist("Post Malone");
        song.setSongName("WoW");
        song.setDuration(3.45);

        songList.add(song);

        song = new Song();
        song.setId(2);
        song.setArtist("Eminem");
        song.setSongName("Business");
        song.setDuration(4.12);

        songList.add(song);

        return songList;

    }
}
