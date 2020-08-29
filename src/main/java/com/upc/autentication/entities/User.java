package com.upc.autentication.entities;

import javax.persistence.*;



@Entity
@Table(name=("USERS_TABLE"))

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    private String email;
    private String password;
    private String name;
    private String lastname;
    private int role;
    private int age;
    private String sex;
    private double weight;
    private String preferences;
    private String lifestyle;
    private int freeTime;
    private String height;
    private String goal;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(int freeTime) {
        this.freeTime = freeTime;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
