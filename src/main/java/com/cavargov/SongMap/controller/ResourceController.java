package com.cavargov.SongMap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ResourceController {

    @GetMapping(path = "/res")
    public String getResource(){
        return "SUCCESS!!!";
    }
}
