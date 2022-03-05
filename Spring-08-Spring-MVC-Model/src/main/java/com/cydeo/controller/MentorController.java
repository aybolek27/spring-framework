package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MentorController {



    @RequestMapping("/mentor")
    public String mentor(Model model){
/*
        Mentor mentor1=new Mentor("Allen", "Parker", 27, Gender.MALE);
        Mentor mentor2=new Mentor("Ali", "Ashyrov", 11, Gender.MALE);
        Mentor mentor3=new Mentor("Yusup", "Ashyrov", 13, Gender.MALE);
        Mentor mentor4=new Mentor("Aybolek", "Hudayberdiyeva", 39, Gender.FEMALE);

        model.addAttribute("mentor1", mentor1);
        model.addAttribute("mentor2",mentor2);
        model.addAttribute("mentor3", mentor3);
        model.addAttribute("mentor4",mentor4);

        return "mentor/mentor-list";*/

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike","Smith",45, Gender.MALE));
        mentorList.add(new Mentor("Tom","Hanks",65, Gender.MALE));
        mentorList.add(new Mentor("Ammy","Bryan",25, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";

    }
}
