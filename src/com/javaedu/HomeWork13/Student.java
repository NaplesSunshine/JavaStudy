package com.javaedu.HomeWork13;

public class Student extends Person {
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println(getName() + "我承诺，我会好好学习");
    }

    @Override
    public String play() {
        return this.getName() + "爱玩足球";
    }

    public void printInfo() {
        System.out.println("学生的信息：");
        System.out.println(super.baseInfo());
        System.out.println("学号：" + this.getStu_id());
        this.study();
        System.out.println(this.play());
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}
