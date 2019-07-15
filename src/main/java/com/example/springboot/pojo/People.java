package com.example.springboot.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: 02-springboot-web
 * @description:
 * @author: ZLQ
 * @create: 2019-06-11 17:30
 **/
@Component
@ConfigurationProperties(prefix = "boot")
public class People {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
