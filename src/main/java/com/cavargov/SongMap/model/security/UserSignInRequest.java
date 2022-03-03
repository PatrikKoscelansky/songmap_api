package com.cavargov.SongMap.model.security;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignInRequest {
    private String username;
    private String email;
    private String password;
    private String newPassword;
}
