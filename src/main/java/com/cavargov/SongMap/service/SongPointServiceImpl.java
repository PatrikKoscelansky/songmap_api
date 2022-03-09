package com.cavargov.SongMap.service;

import com.cavargov.SongMap.model.dto.SongPointCreateDto;
import com.cavargov.SongMap.model.dto.SongPointRespDto;
import com.cavargov.SongMap.model.security.JwtAuthentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.List;

public class SongPointServiceImpl implements SongPointService{

    public List<SongPointRespDto> createSongPointsForUser(List<SongPointCreateDto> songPoints){
        String sub = getActualSubject();

        return null;
    }

    private String getActualSubject(){
        return ((JwtAuthentication) SecurityContextHolder.getContext().getAuthentication()).getJwtClaimsSet().getSubject();
    }
}
