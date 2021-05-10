package com.javaedu.homework05;

public class Peasant extends Employee{
    public Peasant(String name, String job, double baseSalary) {
        super(name, job, baseSalary);
    }

    @Override
    public double calYearSalary() {
        return this.getBaseSalary() * 12;
    }
}
