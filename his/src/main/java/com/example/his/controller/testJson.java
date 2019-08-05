package com.example.his.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testJson {
    @PostMapping("/testJson")
    public String testJson(String aa,String bb){
        System.out.println(aa);
        return "success";
    }
}
