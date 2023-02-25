package com.ua.robot.lesson14;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public abstract void getDescription();
}
