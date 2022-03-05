package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){
        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC - model");

        String subject="Collections";
        model.addAttribute("subject", subject);
        //create some random student id (0-1000) and show it in your UI

//        Random r = new Random();
//        int studentID = r.nextInt(1001);
//        model.addAttribute("StudentID", studentID);
//
        int studentId= new Random().nextInt(1001);
        model.addAttribute("id", studentId);

        List<Integer> numbers=new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        model.addAttribute("numbers", numbers);

        return "student/welcome";

    }
}
