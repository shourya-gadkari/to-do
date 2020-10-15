package com.classes.CRUD.demo.Service;

import com.classes.CRUD.demo.Model.User;
import com.classes.CRUD.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class Main {

    @Autowired
    UserRepository userRepository;

    public String insert(String task) {
        User user = new User(task);
        userRepository.save(user);
        return "index";
    }  

    public String remove(int id) {
        int id2 = id;
        userRepository.deleteById(id2);
        return "Deleted";
    }
    public Object geteverything(){
        Object obj = userRepository.findAll();
        return obj;
    }
    }
