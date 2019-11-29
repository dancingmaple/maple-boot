package com.maple.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongsj
 * @date 2019/11/29 14:38
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("hi")
    public String hello(){
        return  "hi";
    }

}
