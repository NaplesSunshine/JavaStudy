package com.Homework.chapter11.Homework04;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new ICalculator() {
            @Override
            public double work(double num1, double num2) {
                return num1 + num2;
            }
        }, 2, 3);
        cellPhone.testWork(new ICalculator() {
            @Override
            public double work(double num1, double num2) {
                return num1 * num2;
            }
        }, 3, 4);
    }
}
