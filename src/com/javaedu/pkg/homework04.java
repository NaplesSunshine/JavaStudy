package com.javaedu.pkg;

public class homework04 {
    public static void main(String[] args) {
        Employee manager = new Manager("Eve Die",450,30,1.2,1000);
        Employee worker = new Worker();
        worker.setName("Wek Seo");
        worker.setDailySalary(350);
        worker.setWorkDay(30);
        worker.setLevel(1.0);

        manager.printSalary();
        worker.printSalary();
    }
}
