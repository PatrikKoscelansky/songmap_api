package com.cavargov.SongMap.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "songPoint")
@Getter
@Setter
@NoArgsConstructor
public class SongPoint {
//    id = Column(Integer, primary_key=True, index=True)
//    track_id = Column(Integer, ForeignKey("tracks.id"), nullable=True)
//    song_id = Column(Integer, ForeignKey("songs.id"), nullable=False)
//    owner_id = Column(Integer, ForeignKey("users.id"), nullable=False)
//    likes = Column(Integer, nullable=False, default=0, index=True)
//    time_added = Column(DateTime, nullable=False, index=True)
//    longitude = Column(Float)
//    latitude = Column(Float)
//    geo = Column(Geometry(geometry_type="POINT"))

    @Id
    private String id;
    private String songId;
    private String ownerId;
    private int likes;
    private Instant timeAdded;
    //TODO: figure out how to map double lat lng to mongo geospatial using MapStruct.
}
