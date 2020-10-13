package com.classes.CRUD.demo.Model;

import javax.persistence.*;

@Entity

public class User {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "task")
    String task;

    public User(int id, String task) {
        this.id = id;
        this.task = task;
    }

    public User(String task) {
        this.task = task;
    }

    public String gettask() {
        return task;
    }

    public void settask(String task) {
        this.task = task;
    }
}
