package com.javaedu.HomeWork13;

public abstract class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String baseInfo() {
        return "姓名：" + this.getName() + "\n" + "年龄：" + this.getAge() + "\n" + "性别：" + this.getSex();
    }

    public abstract String play();

    @Override
    public String toString() {
        return this.getClass().getName() +
                "{name=" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
