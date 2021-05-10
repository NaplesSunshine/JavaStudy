package com.javaedu.pkg;

public class Worker extends Employee {
    private double salary;

    public Worker() {

    }

    public Worker(String name, double dailySalary, int workDay, double level) {
        super(name, dailySalary, workDay, level);
    }

    @Override
    public void printSalary() {
        this.salary = this.calBaseSalary();
        System.out.println(this.getClass().getName() + "{" + this.getName() + "'s salary is " + this.salary + "}");
    }
}
