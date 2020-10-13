package com.classes.CRUD.demo.Controler;


import com.classes.CRUD.demo.Service.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Crud_Controller {
    @Autowired
    Main main;
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/task")
    public  String  task(@RequestParam String task){
        String result = main.insert(task);
        return "index";
    }
    @RequestMapping("/delete")
    public String delete(Model model,@RequestParam String id){
        main.remove(id);
        model.addAttribute("object", main.geteverything());
        return "index";}
}