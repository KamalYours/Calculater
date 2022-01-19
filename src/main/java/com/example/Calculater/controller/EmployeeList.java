package com.example.Calculater.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeList {

    ArrayList<String> List = new ArrayList<String>();

    @RequestMapping("/add+")
    public String addEmp(@RequestParam String element){
        List.add(element);
        return "Add sucessfully..."+element;
    }

    @RequestMapping("/get")
    public ArrayList<String> getEmp(){
        return List;
    }
}
