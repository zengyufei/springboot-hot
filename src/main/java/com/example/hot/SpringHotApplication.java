package com.example.hot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.hot.mapper")
public class SpringHotApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHotApplication.class, args);
    }

}
