package com.ua.robot.lesson14;

public class Teacher extends Person {
    private String subject;
    public Teacher() {
    }

    public Teacher(String firstName, String lastName, int age, String subject) {
        super(firstName, lastName, age);
        this.subject = subject;
    }

    @Override
    public void getDescription() {
        System.out.println("It's a teacher " + firstName + " " + lastName + ". His age " + age + ". He teaches " + subject);
    }
}
