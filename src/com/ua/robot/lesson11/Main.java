package com.ua.robot.lesson11;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", 2015, "green");
        System.out.println(car.getCarType());

        PassengerCar pCar = new PassengerCar("Mazda", 2016, "black");
        System.out.println(pCar.getCarType());

        Truck truck = new Truck("BMW", 2000, "white");
        System.out.println(truck.getCarType());
    }
}
