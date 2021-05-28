package com.Exception;

import java.util.Scanner;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 0;
        boolean loop = true;
        Scanner myScanner = new Scanner(System.in);
        do {
            try {
                System.out.print("请输入一个数：");
                age = Integer.parseInt(myScanner.next());
                if (!(age >=18 && age <= 120)) {
                    throw new AgeException("年龄需要在18~120之间");
                }
                loop = false;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数" + "\n" + "=============");
            }
        } while (loop);
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
