package com.example.springboot.controller;

import com.example.springboot.pojo.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    @Value("${boot.name}")
    private String name;

    @Value("${boot.age}")
    private int age;

    @Autowired
    private People someOne;

    @RequestMapping("/boot/hello")
    public @ResponseBody
    String hello() {
//        return "Hello Spring Boot! My name is "+name+" and I'm "+age+" years old! ";
        return "Hello Spring Boot! My name is " + someOne.getName() + " and I'm " + someOne.getAge() + " years old ! ";
    }

    @GetMapping("/boot/index")
    public String index(Model model) {
        model.addAttribute("msg", "Spring Boot 集成 JSP ");
        return "index";
    }
}
