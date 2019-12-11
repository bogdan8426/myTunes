package com.bogdanrotaru.myTunes.Controller;

import com.bogdanrotaru.myTunes.Model.Song;
import com.bogdanrotaru.myTunes.Service.SongService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class Controller {

    private SongService songService;

    public Controller(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping("/")
    public List<Song> getMySongs(){
        return songService.getSongList();
    }

}
