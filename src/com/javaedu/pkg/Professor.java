package com.javaedu.pkg;

public class Professor extends Teacher{
    public Professor() {

    }
    public Professor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }
    @Override
    public void introduce() {
        super.introduce();
    }
}
