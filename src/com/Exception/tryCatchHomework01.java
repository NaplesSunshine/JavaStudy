package com.Exception;

import java.util.Scanner;

/**
 * @author naplessunshine
 * @version 1.0.0
 * 实现功能：如果用户输入的不是一个整数， 就提示他反复输入， 直到输入一个整数为止
 */
public class tryCatchHomework01 {

    public static void main(String[] args) {
        int sum = 0;
        boolean loop = true;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.print("请输入一个数:");
            try {
                sum = Integer.parseInt(myScanner.next());
                loop = false;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
                System.out.println("================");
            }
        } while (loop);
        System.out.println(sum);
    }

}
