package com.cavargov.SongMap.model.security;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignInResponse {
    private String accessToken;
    private String idToken;
    private String refreshToken;
    private String tokenType;
    private Integer expiresIn;
}
