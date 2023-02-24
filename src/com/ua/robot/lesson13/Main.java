package com.ua.robot.lesson13;

import com.ua.robot.lesson13.domain.Student;
import com.ua.robot.lesson13.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.printAllStudents();

        System.out.println("The best student:");
        studentService.printStudent(studentService.findBestStudent());


        System.out.println();
        System.out.println("The worst student:");
        studentService.printStudent(studentService.findWorstStudent());
    }
}
