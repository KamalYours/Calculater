package com.example.Calculater.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculater {

    @RequestMapping("add")
    public int Addition(){
        int a = 54;
        int b =45;
        int c = a+b;
        return c;
    }
@RequestMapping("sub")
    public String subtraction(){
        int a =45;
         int b =85;
         int c = a+b;
         return "Subtraction of the two  numbers--"+c;
    }

    @RequestMapping("mul")
    public String multiple(){
        int a = 97;
         int b =85;
          int c=a+b;
          return "multiple of two  numbers--"+c;
    }

    @RequestMapping("dis")
    public String Display(){
        return "I will become the good software engineer";
    }

    @RequestMapping("Sum/{a}/{b}")
    public int sum(@PathVariable int a , @PathVariable int b){
        int c =a+b;
        return c;
    }

    @RequestMapping("Div/{a}/{b}")
    public int div(@PathVariable int a , @PathVariable int b ){
        int c = a/b;
        return c;
    }

    @RequestMapping("Sub/{a}/{b}")
    public int sub(@PathVariable int a , @PathVariable int b ){
        int c = a-b;
        return c;
    }

    @RequestMapping("Mul/{a}/{b}")
    public int mul(@PathVariable int a ,@PathVariable int b ){
        int c = a*b;
        return c;
    }

    @RequestMapping("gr")
    public String greating(@RequestParam String msg){
        return "Hello --"+msg;

    }

    @RequestMapping("Sum1")
    public int sum1(@RequestParam int a, @RequestParam int b ){
        int c= a+b;
        return c;
    }

}
