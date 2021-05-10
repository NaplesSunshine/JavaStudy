package com.javaedu.homework05;

public abstract class Employee {
    private String name;
    private String job;
    private double baseSalary;

    public Employee(String name, String job, double baseSalary) {
        this.name = name;
        this.job = job;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void printSalary() {
        System.out.println(this.getName() + "'s annual income is " + this.calYearSalary());
    }

    public abstract double calYearSalary();
}
