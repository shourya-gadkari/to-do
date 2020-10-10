package com.classes.CRUD.demo.Controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.rmic.Main;

@RestController
public class Crud_Controler {
    @Autowired
    Main main;
//    1. Name, age, school, class, place
    @PostMapping("/")
    public String insert(){
        return "index";
    }
    @RequestMapping("/task")
    public  String  task(@RequestParam String task){
        String result = main.insert(task);
    }
}
