package com.ua.robot.lesson15;

public class Main {
    public static void main(String[] args) {
        Flyable pilot = new Pilot();
        pilot.fly();

        Driveable driver = new Driver();
        driver.drive();
    }
}
