package com.cavargov.SongMap.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Song {
    @Id
    private int id;
    private String artist;
    private String title;
    private String spotifyId;

}
