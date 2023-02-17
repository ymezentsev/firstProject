package com.ua.robot.lesson12;

public class Child extends Parent{

    static {
        System.out.println("Static block Child - 2");
    }

    {
        System.out.println("Init block Child - 5");
    }
    public Child() {
        System.out.println("Constructor Child - 6");
    }
}
