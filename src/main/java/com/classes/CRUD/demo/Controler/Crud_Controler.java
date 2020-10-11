package com.classes.CRUD.demo.Controler;


import com.classes.CRUD.demo.Service.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Crud_Controler {
    @Autowired
    Main main;
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @PostMapping("/task")
    public  String  task(@RequestParam String task){
        String result = main.insert(task);
        return "index";
    }
}
