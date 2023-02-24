package com.ua.robot.lesson14;


public class Main {
    public static void main(String[] args) {
        Person student = new Student("Ivan", "Ivanov", 20, "G123");
        Person teacher = new Teacher("Sergey", "Parchomov", 45, "Math");
        student.getDescription();
        teacher.getDescription();
    }
}
