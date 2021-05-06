package com.inheritance;

import java.time.*;
import java.util.Objects;

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

    //重写 Object 的 equals 方法
    @Override
    public boolean equals(Object otherObject) {
        if(this == otherObject) {
            return true;
        }
        if(otherObject == null) {
            return false;
        }
        if(getClass() != otherObject.getClass()) {
            return false;
        }
        Employee other = (Employee)otherObject;
        return this.equals(other.getName()) && salary == other.salary && hireDay.equals(other.hireDay);
    }

    //当直接输出一个对象时， toString 方法会被默认的调用
    /*
    @Override
    public String toString() {
        return "Employee{" +
                "name=" + this.getName() +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
    */

    @Override
    public String toString() {
        return super.toString() +
                "[salary=" + salary +
                ", hireDay=" + hireDay +
                "]";
    }
}
