package com.Homework.chapter11.Homework05;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class A {
    private String name = "A";

    public void f1() {
        class B {
            private final String name = "B";

            public void show() {
                System.out.println("B's name = " + name + "; A's name = " + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
