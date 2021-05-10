package com.javaedu.homework05;

public class Worker extends Employee{

    public Worker(String name,String job,double baseSalary) {
        super(name, job, baseSalary);
    }
    public double calYearSalary() {
        return this.getBaseSalary() * 12;
    }
}
