package com.ua.robot.lesson13.service;

import com.ua.robot.lesson13.domain.Student;
import com.ua.robot.lesson13.repository.StudentMemoryRepository;

public class StudentService {

    private static final String TABLE_FORMAT = "|%-5s |%-15s |%-15s |%-8s |%-10s|%n";
    private static final int LINE_SIZE = 63;
    private StudentMemoryRepository studentMemoryRepository;

    public StudentService() {
        studentMemoryRepository = new StudentMemoryRepository();
    }

    public void printAllStudents() {
        printLine();
        System.out.printf(TABLE_FORMAT, "Id", "Firstname", "LastName", "Group", "Aver. mark");
        printLine();

        for (Student student : studentMemoryRepository.findAllStudents()) {
            if (student != null) {
                printStudent(student);
            }
        }
        printLine();
    }

    public void printStudent(Student student) {
        System.out.printf(TABLE_FORMAT, student.getId(), student.getFirstName(), student.getLastName(),
                student.getGroup(), student.getAvgMark());
    }

    private void printLine() {
        for (int i = 0; i < LINE_SIZE; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public Student findBestStudent() {
        Student student = null;
        double bestMark = 0;
        for (Student stud : studentMemoryRepository.findAllStudents()) {
            if (stud != null) {
                if (bestMark < stud.getAvgMark()) {
                    bestMark = stud.getAvgMark();
                    student = stud;
                }
            }
        }
        return student;
    }

    public Student findWorstStudent() {
        Student student = null;
        double worstMark = 5;
        for (Student stud : studentMemoryRepository.findAllStudents()) {
            if (stud != null) {
                if (worstMark > stud.getAvgMark()) {
                    worstMark = stud.getAvgMark();
                    student = stud;
                }
            }
        }
        return student;
    }
}
