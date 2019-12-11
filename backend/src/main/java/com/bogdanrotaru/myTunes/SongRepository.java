package com.bogdanrotaru.myTunes;

import com.bogdanrotaru.myTunes.Model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<Song, String> {
}
