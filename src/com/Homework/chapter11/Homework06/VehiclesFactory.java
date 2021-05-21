package com.Homework.chapter11.Homework06;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class VehiclesFactory {
    public static Horse getHorse() {
        return new Horse();
    }
    public static Boat getBoat() {
        return new Boat();
    }
}
