package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//开启springboot自动配置 可以自动扫描同级及以下路径中的类以及注解
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        启动springboot 程序，内置tomcat
        SpringApplication.run(Application.class, args);
    }

}
