package com.ua.robot.lesson11;

public class Car {
    private String model;
    private int admissionYear;
    private String color;


    public Car(String model, int admissionYear, String color) {
        this.model = model;
        this.admissionYear = admissionYear;
        this.color = color;
    }

    public String getCarType() {
        return "This is a car. Model - " + this.model + ", year of admission - " + this.admissionYear + ", color - " + this.color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
