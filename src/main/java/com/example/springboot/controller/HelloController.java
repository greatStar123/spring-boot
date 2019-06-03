package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: 02-springboot-web
 * @description:
 * @author: ZLQ
 * @create: 2019-06-03 16:01
 **/
@Controller
public class HelloController {
    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){
        return "Hello Spring Boot!";
    }
}
