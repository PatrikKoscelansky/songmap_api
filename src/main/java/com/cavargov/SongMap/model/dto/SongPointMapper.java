package com.cavargov.SongMap.model.dto;

import com.cavargov.SongMap.model.SongPoint;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SongPointMapper {

    SongPoint songPointCreateDtoToSongPoint(SongPointCreateDto createDto);
    List<SongPoint> songPointCreateDtosToSongPoints(List<SongPointCreateDto> createDtos);

    SongPointRespDto songPointToSongPointRespDto(SongPoint songPoints);
    List<SongPointRespDto> songPointsToSongPointRespDtos(List<SongPoint> songPoints);

}
