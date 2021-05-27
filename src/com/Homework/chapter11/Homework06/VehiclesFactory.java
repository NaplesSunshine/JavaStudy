package com.Homework.chapter11.Homework06;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class VehiclesFactory {
    private final static Horse horse = new Horse();

    private VehiclesFactory() {
    }

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Airport getAirport() {
        return new Airport();
    }
}
