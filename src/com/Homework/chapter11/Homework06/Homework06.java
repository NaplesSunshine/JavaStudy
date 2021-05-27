package com.Homework.chapter11.Homework06;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class Homework06 {
    public static void main(String[] args) {
        Person tangseng = new Person("唐僧", VehiclesFactory.getHorse());
        tangseng.comm();
        tangseng.passRiver();
        tangseng.comm();
        tangseng.passMountain();
    }
}
