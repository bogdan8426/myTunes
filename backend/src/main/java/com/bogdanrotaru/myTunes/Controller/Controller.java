package com.bogdanrotaru.myTunes.Controller;

import com.bogdanrotaru.myTunes.Model.Artist;
import com.bogdanrotaru.myTunes.Service.ArtistService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class Controller {

    private ArtistService artistService;

    public Controller(ArtistService artistService) {
        this.artistService = artistService;
    }

    @CrossOrigin
    @RequestMapping("/artists")
    public List<Artist> getMySongs(){
        return artistService.getArtistList();
    }

}
