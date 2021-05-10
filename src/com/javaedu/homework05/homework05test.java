package com.javaedu.homework05;

public class homework05test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Worker("Wide", "Worker", 1000);
        employees[1] = new Peasant("Rde", "Peasant", 2000);
        employees[2] = new Teacher("Sat","Teacher",3000,180,100);
        employees[3] = new Scientists("Jar","Scientists",3000,10000);

        for (int i = 0; i < employees.length; i++) {
           employees[i].printSalary();
        }
    }
}
