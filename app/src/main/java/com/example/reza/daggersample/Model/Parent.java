package com.example.reza.daggersample.Model;

import javax.inject.Inject;

public class Parent {

    private String name;


    Child child;

    @Inject
    public Parent(String name, Child child) {
        this.name = name;
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public String getChildname() {
        return child.getName();
    }

    public int getChildAge() {
        return child.getAge();
    }
}
