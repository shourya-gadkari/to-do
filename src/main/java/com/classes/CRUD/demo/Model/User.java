package com.classes.CRUD.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "to-do")
public class User {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "task")
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
