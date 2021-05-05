package com.inheritance;

import java.time.*;

public class Employee extends Person {

    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int mouth, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, mouth, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        salary += raise;
    }
}
