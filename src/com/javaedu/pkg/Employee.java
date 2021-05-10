package com.javaedu.pkg;

public abstract class Employee {
    private String name;
    private double dailySalary;
    private int workDay;
    private double level;

    public Employee() {

    }

    public Employee(String name, double dailySalary, int workDay, double level) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.workDay = workDay;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    protected double calBaseSalary() {
        return this.dailySalary * this.workDay * this.level;
    }

    public abstract void printSalary();
}
