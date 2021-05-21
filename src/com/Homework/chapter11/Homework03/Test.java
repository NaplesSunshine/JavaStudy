package com.Homework.chapter11.Homework03;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[0].shout();
        animals[1].shout();
    }
}
