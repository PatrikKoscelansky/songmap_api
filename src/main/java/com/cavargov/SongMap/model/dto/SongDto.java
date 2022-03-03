package com.cavargov.SongMap.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SongDto {
    private int id;
    private String artist;
    private String title;
    @JsonProperty("spotify_id")
    private String spotifyId;
}
