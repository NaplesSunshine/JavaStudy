package com.Homework.chapter11.Homework07;

public class Car {
    private static double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("温度大于40 空调吹冷气..");
            } else if (temperature < 0) {
                System.out.println("温度小于0 空调吹暖气..");
            } else {
                System.out.println("温度正常，关闭空调..");
            }
        }
    }

    public static double getTemperature() {
        return temperature;
    }
}
