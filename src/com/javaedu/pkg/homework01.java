package com.javaedu.pkg;

public class homework01 {
    public static void main(String[] args) {
        Person1[] person1s = new Person1[3];
        person1s[0] = new Person1("Jack", 18, "Student");
        person1s[1] = new Person1("Mark", 17, "Li");
        person1s[2] = new Person1("Dk", 32, "Teacher");

    }
}
class Person1 {
    public String name;
    public int age;
    public String job;

    public Person1(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
}
