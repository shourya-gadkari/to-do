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
    public String home(Model model){
        model.addAttribute("task_object", main.geteverything());
        return "index";
    }

    @RequestMapping("/add")
    public String add(Model model, @RequestParam String task){
        main.insert(task);
        model.addAttribute("task_object", main.geteverything());
        return "index";
    }

    @RequestMapping("/delete")
    public String delete(Model model, @RequestParam String id){
        main.remove(Integer.parseInt(id));
        model.addAttribute("task_object", main.geteverything());
        return "index";
    }

}
