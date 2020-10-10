package com.classes.CRUD.demo.Controler;


import com.classes.CRUD.demo.Service.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Crud_Controler {
    @Autowired
    Main main;
    @RequestMapping("/home")
    public String home(){
        return "index";
    }
    @RequestMapping("/task")
    public  String  task(@RequestParam String task){
        String result = main.insert(task);
        return "index";
    }
}
