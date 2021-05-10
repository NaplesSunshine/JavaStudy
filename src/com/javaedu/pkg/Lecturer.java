package com.javaedu.pkg;

public class Lecturer extends Teacher{
    public Lecturer(String name, int age, String post, double salary, double level) {
        super(name,age,post,salary,level);
    }
    @Override
    public void introduce() {
        super.introduce();
    }
}
