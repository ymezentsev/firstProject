package com.ua.robot.lesson11;

public class Truck extends Car {

    public Truck(String model, int admissionYear, String color) {
        super(model, admissionYear, color);
    }

    @Override
    public String getCarType() {
        return "This is a truck." +
                " Model - " + getModel() + ", year of admission - " + getAdmissionYear() + ", color - " + getColor();
    }
}
