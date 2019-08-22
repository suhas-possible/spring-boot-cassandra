package com.example.springbootcassandra.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Employee {
    @PrimaryKey
    private int id;
    private String name;
    private int age;
    private String position;
    private String city;

    public Employee() {
    }

    public Employee(int id, String name, int age, String position, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
