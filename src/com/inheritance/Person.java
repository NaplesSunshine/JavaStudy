package com.inheritance;

public abstract class Person {
    public abstract String getDescription();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayName() {
        System.out.println("My name is " + this.name);
    }
}
