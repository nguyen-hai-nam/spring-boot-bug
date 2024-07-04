package com.example.heroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "heroes")
public class Hero {

    @Id
    private String id;
    private String name;
    private String superpower;
    private int age;

    public Hero() {
    }

    public Hero(String name, String superpower, int age) {
        this.name = name;
        this.superpower = superpower;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", superpower='" + superpower + '\'' +
                ", age=" + age +
                '}';
    }
}