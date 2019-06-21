package com.example.springboot.service.impl;

import com.example.springboot.mapper.StudentMapper;
import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: 02-springboot-web
 * @description:
 * @author: ZLQ
 * @create: 2019-06-21 18:24
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.seletAllStudent();
    }
}
