package com.example.hot.api;


import com.example.hot.entity.User;
import com.example.hot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class DemoController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public String hello(String name) {
        return String.format("Hello %s!", name);
    }
    @GetMapping("/mp")
    public String mp() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        return userList.stream().map(User::toString).collect(Collectors.joining(","));
    }
//    @GetMapping("/mp2")
//    public String mp2() {
//        List<User> userList = userMapper.test();
//        userList.forEach(System.out::println);
//        return userList.stream().map(User::toString).collect(Collectors.joining(","));
//    }

//    @GetMapping("/mp3")
//    public String mp3() {
//        List<User> userList = userMapper.test2();
//        userList.forEach(System.out::println);
//        return userList.stream().map(User::toString).collect(Collectors.joining(","));
//    }

//    @GetMapping("/ccc")
//    public String ccc(String name) {
//        return String.format("ccc %s!", name);
//    }
//    @GetMapping("/bbb")
//    public String bbb(String name) {
//        return String.format("bbb %s!", name);
//    }
}
