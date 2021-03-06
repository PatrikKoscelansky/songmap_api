package com.cavargov.SongMap.controller;

import com.cavargov.SongMap.model.dto.SongDto;
import com.cavargov.SongMap.model.dto.SongPointCreateDto;
import com.cavargov.SongMap.model.dto.SongPointRespDto;
import com.cavargov.SongMap.model.security.JwtAuthentication;
import org.joda.time.DateTime;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class SongPointController {

    @GetMapping(path = "/songpoints")
    public List<SongPointRespDto> getResource(
            @RequestParam float longitude,
            @RequestParam float latitude,
            @RequestParam(defaultValue = "50") int radius,
            @RequestParam(defaultValue = "0") int skip,
            @RequestParam(defaultValue = "100") int limit
    ){
        Instant now = Instant.now();
        SongDto songDto = new SongDto();
        songDto.setId(9);
        songDto.setArtist("Oasis");
        songDto.setTitle("Don't look back in anger");
        songDto.setSpotifyId("9sd9s0dsi0sd90ds80sd908sdf0sdf980");
        List<SongPointRespDto> songPoints = new ArrayList<>(List.of(
                new SongPointRespDto(9, longitude, latitude, now, 9, 9, songDto),
                new SongPointRespDto(10, longitude, latitude, now, 10, 10, songDto)
        ));

        return songPoints;
    }

    @PostMapping(path = "/users/me/songpoints/")
    public List<SongPointRespDto> createSongPointsForUser(@RequestBody List<SongPointCreateDto> songPoints){
        JwtAuthentication authentication = (JwtAuthentication) SecurityContextHolder.getContext().getAuthentication();
        String subject = authentication.getJwtClaimsSet().getSubject();
        System.out.println(subject);
        return List.of();
    }

}
