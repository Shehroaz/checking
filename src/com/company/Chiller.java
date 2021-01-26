package com.company;

public class Chiller {
    private String name;
    private int age;
    private char sex;


    public Chiller() {
    }

    public Chiller(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    //endregion Setters

    //region Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }
    //endregion Getters
}
