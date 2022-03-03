package com.cavargov.SongMap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpotifyAuthController {

    @GetMapping(path = "/spotify_auth_callback")
    public String getResource(){
        return  """
                <html>
                            <head>
                                <title>Spotify authorization flow</title>
                            </head>
                            <body>
                                <h1>You can now go back to your app.</h1>
                            </body>
                        </html>
                """;
    }

}
