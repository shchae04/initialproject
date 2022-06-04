package com.csh.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("나불렀냥????ㅇㄹ?ㄴㅇㄹ?ㅇㄴㅁ?ㄹ?ㄴㅇㅁㄻ?ㄴㄹ?ㅁㄴ?ㄹㅇ");
        return "hello";
    }
}
