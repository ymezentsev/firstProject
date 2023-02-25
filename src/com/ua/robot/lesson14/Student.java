package com.ua.robot.lesson14;

public class Student extends Person {
    private String group;
    public Student() {
    }

    public Student(String firstName, String lastName, int age, String group) {
        super(firstName, lastName, age);
        this.group = group;
    }

    @Override
    public void getDescription() {
        System.out.println("It's a student " + firstName + " " + lastName + ". His age " + age + ". His group " + group);
    }
}
