package com.example.Calculater.controller;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeList2 {

    ArrayList<String> list = new ArrayList<String >();

    public String addEmp2(@RequestParam String element){
        list.add(element);
        return "Add succw";
    }
}
