package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("/car")
public class CarController {

    // localhost:8080/car/info?make=Honda
    @RequestMapping("/info")     // localhost:8080/car/info?make=Honda&year=2015  --> with 2 request param
    public  String carInfo(@RequestParam String make, @RequestParam int year, Model model){
//        System.out.println(make);
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }


    @RequestMapping("/info2")     // localhost:8080/car/info2   ----->  localhost:8080/car/info2?make=Nissan
    public  String carInfo2(@RequestParam(value = "make", required = false, defaultValue="Tesla") String make, Model model){
        model.addAttribute("make", make);
        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}")   //localhost:8080/car/info/honda
    public String getCarInfo(@PathVariable String make,@PathVariable int year, Model model){
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }

}
