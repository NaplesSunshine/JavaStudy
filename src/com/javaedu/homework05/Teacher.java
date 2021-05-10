package com.javaedu.homework05;

public class Teacher extends Employee {
    private int classDay;
    private double classSalary;

    public Teacher(String name, String job, double baseSalary, int classDay, double classSalary) {
        super(name, job, baseSalary);
        this.classDay = classDay;
        this.classSalary = classSalary;
    }

    public int getClassDay() {
        return classDay;
    }

    public double getClassSalary() {
        return classSalary;
    }

    @Override
    public double calYearSalary() {
        return this.getClassSalary() * this.getClassDay() + this.getBaseSalary() * 12;
    }
}
