package com.javaedu.homework05;

public class Scientists extends Employee {
    private double bonus;

    public Scientists(String name, String job, double baseSalary, double bonus) {
        super(name, job, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calYearSalary() {
        return this.getBonus() + this.getBaseSalary() * 12;
    }
}
