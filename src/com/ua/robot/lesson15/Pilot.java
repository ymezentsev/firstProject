package com.ua.robot.lesson15;

public class Pilot extends Human implements Flyable{
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
