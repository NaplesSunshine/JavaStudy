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
        if(!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void comm() {
        if(!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public void passMountain() {
        if(!(vehicles instanceof Airport)) {
            vehicles = VehiclesFactory.getAirport();
        }
        vehicles.work();
    }
}
