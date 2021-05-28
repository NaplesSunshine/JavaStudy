package com.Exception;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class CustomExceptionHomework01 {
    static void methodA() {
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("调用方法A的finally");
        }
    }
    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用方法B的finally");
        }
    }
    public static void main(String[] args) {
        try {
            CustomExceptionHomework01.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        CustomExceptionHomework01.methodB();
    }
}
