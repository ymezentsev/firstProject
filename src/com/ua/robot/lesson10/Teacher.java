package com.ua.robot.lesson10;

public class Teacher {
    private String firstName;
    private String lastName;
    private String taughtSubject;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String taughtSubject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.taughtSubject = taughtSubject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTaughtSubject() {
        return taughtSubject;
    }

    public void setTaughtSubject(String taughtSubject) {
        this.taughtSubject = taughtSubject;
    }
}
