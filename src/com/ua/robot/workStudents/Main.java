package com.ua.robot.workStudents;

import com.ua.robot.workStudents.domain.Student;
import com.ua.robot.workStudents.repository.StudentMemoryRepository;
import com.ua.robot.workStudents.service.StudentService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.printAllStudents();

        System.out.println("The best student:");
        studentService.printStudent(studentService.findBestStudent());
        System.out.println(studentService.getAverageMark(studentService.findBestStudent()));
        studentService.printDeserveScholarship(studentService.findBestStudent());


        System.out.println();
        System.out.println("The worst student:");
        studentService.printStudent(studentService.findWorstStudent());
        System.out.println(studentService.getAverageMark(studentService.findWorstStudent()));
        studentService.printDeserveScholarship(studentService.findWorstStudent());

        System.out.println();
        for (Student student : studentService.findAll()) {
            studentService.printStudent(student);
            System.out.println("Min mark - " + studentService.findMinMark(student));
            System.out.println("Average mark - " + studentService.getAverageMark(student));
            studentService.printDeserveScholarship(student);
            System.out.println();
        }


    }
}
