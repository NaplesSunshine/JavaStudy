package com.Homework.chapter11.Homework04;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class CellPhone {
    public void testWork(ICalculator iCalculator, double num1, double num2) {
        double result = iCalculator.work(num1, num2);
        System.out.println("result= " + result);
    }
}
