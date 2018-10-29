package com.atguigu.controller;

import com.atguigu.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public  String helllo(){
//        new Student();
        List list = new ArrayList<Student>();
        Student student = new Student();
        Date date = new Date();
        String dateStr = date.toString();

        return dateStr;
    }
}
