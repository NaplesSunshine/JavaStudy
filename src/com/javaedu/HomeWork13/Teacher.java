package com.javaedu.HomeWork13;

public class Teacher extends Person {
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺，我会认真教学");
    }

    @Override
    public String play() {
        return this.getName() + "爱玩象棋";
    }
    public void printInfo() {
        System.out.println("教师的信息：");
        System.out.println(super.baseInfo());
        System.out.println("工龄：" + this.getWork_age());
        this.teach();
        System.out.println(this.play());
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
}
