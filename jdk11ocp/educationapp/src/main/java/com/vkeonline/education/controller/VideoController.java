package com.vkeonline.education.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @RequestMapping("list")
    public Object list() {
        Map<String, String> map = new HashMap<>() ;
        map.put("1", "Spring") ;
        map.put("2", "Mysql") ;
        return map ;
    }
}
