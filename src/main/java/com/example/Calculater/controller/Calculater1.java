package com.example.Calculater.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculater1 {

    @RequestMapping("add1")
    public int demo(){
        int a = 54;
         int b = 58;
          int c = a+b;
          return c;
    }

    @RequestMapping("sub1")
    public String demo1(){
        int a =52;
         int b =87;
         int c=a-b;
         return "Subtraction of these two numbers,,"+c;
    }

    @RequestMapping("mul1")
    public String demo2(){
        int a =21;
        int b =46;
        int c =a*b;
        return "Multiple of these two numbers..."+c;

    }

    @RequestMapping("div1")
    public int demo3(){
        int a =85;
        int b =17;
         int c = a/b;
         return c;
    }

    @RequestMapping("add1/{a}/{b}")
    public String demo4(@PathVariable int a , @PathVariable int b){
        int c = a+b;
        return "Sum of these two numbers.."+c;
    }

    @RequestMapping("mul1/{a}/{b}")
    public int demo5(@PathVariable int a, @PathVariable int b){
     int c =a*b;
     return c;
    }

    @RequestMapping("div1/{a}/{b}")
    public String demo6(@PathVariable int a , @PathVariable int b ){
        int c=a/b;
        return "div the numbers..."+c;

    }

    @RequestMapping("sub1/{a}/{b}")
    public int demo7(@PathVariable int a , @PathVariable int b ){
        int c =a-b;
        return c;
    }

    @RequestMapping("sum2")
    public String demo8(@RequestParam int a , @RequestParam int b){
        int c = a+b;
        return "subtraction of the two numbers..."+c;

    }

    @RequestMapping("sub2")
    public int demo9(@RequestParam int a , @RequestParam int b){
        int c =a-b;
        return c;
    }

    @RequestMapping("mul2")
    public int demo10(@RequestParam int a , @RequestParam int b){
        int c = a*b;
        return c;
    }

    @RequestMapping("div2")
    public String demo11(@RequestParam int a , @RequestParam int b){
        int c = a/b;
        return "divided the numbers..."+c;
    }
}
