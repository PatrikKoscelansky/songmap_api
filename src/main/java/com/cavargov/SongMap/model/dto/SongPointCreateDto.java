package com.cavargov.SongMap.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class SongPointCreateDto {
    private float longitude;
    private float latitude;
    @JsonProperty("time_added")
    private Instant timeAdded;
    private SongDto song;
}
