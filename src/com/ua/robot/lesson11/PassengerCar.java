package com.ua.robot.lesson11;

public class PassengerCar extends Car {

    public PassengerCar(String model, int admissionYear, String color) {
        super(model, admissionYear, color);
    }

    @Override
    public String getCarType() {
        return "This is a passenger car." +
                " Model - " + getModel() + ", year of admission - " + getAdmissionYear() + ", color - " + getColor();
    }
}
