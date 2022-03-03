package com.cavargov.SongMap.repository;

import com.cavargov.SongMap.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SongRepository extends MongoRepository<Song, String> {
    List<Song> findByArtist(String artist);
    List<Song> findByTitle(String title);
    Song findBySpotifyId(String spotifyId);
}
