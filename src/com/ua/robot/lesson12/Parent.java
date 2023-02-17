package com.ua.robot.lesson12;

public class Parent {

    static {
        System.out.println("Static block Parent - 1");
    }

    {
        System.out.println("Init block Parent - 3");
    }

    public Parent() {
        System.out.println("Constructor Parent - 4");
    }
}
