package com.inheritance;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int mouth, int day) {
        super(name, salary, year, mouth, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
