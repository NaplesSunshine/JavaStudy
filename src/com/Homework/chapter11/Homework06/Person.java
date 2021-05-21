package com.Homework.chapter11.Homework06;

/**
 * @author naplessunshine
 * @version 1.0.0
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name,Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver() {

        Boat boat = VehiclesFactory.getBoat();
        boat.work();
    }
    public void comm() {
        Horse horse = VehiclesFactory.getHorse();
        horse.work();
    }
}
