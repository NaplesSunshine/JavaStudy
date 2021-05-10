package com.javaedu.pkg;

public class Manager extends Employee {
    private double bonus;
    private double salary;

    public Manager() {

    }

    public Manager(String name, double dailySalary, int workDay, double level, double bonus) {
        super(name, dailySalary, workDay, level);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        this.salary = this.bonus + super.calBaseSalary();
        System.out.println(this.getClass().getName() + "{" + this.getName() + "'s salary is " + this.salary + "}");
    }
}
