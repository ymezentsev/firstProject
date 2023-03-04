package com.ua.robot.workStudents.service;

import com.ua.robot.workStudents.domain.Student;
import com.ua.robot.workStudents.repository.StudentMemoryRepository;
import com.ua.robot.workStudents.repository.StudentRepository;

import java.util.Arrays;

public class StudentService {

    private static final String TABLE_FORMAT = "|%-5s |%-15s |%-15s |%-8s |%-20s|%n";
    private static final int LINE_SIZE = 73;
    private StudentRepository studentRepository;

    public StudentService() {
        studentRepository = new StudentMemoryRepository();
    }

    public Student[] findAll(){
        return studentRepository.findAll();
    }

    public void printAllStudents() {
        printLine();
        System.out.printf(TABLE_FORMAT, "Id", "Firstname", "LastName", "Group", "Marks");
        printLine();

        for (Student student : studentRepository.findAll()) {
            if (student != null) {
                printStudent(student);
            }
        }
        printLine();
    }

    public void printStudent(Student student) {
        System.out.printf(TABLE_FORMAT, student.getId(), student.getFirstName(), student.getLastName(),
                student.getGroup(), Arrays.toString(student.getMarks()));
    }

    private void printLine() {
        for (int i = 0; i < LINE_SIZE; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public double getAverageMark(Student student) {
        double average = 0;
        for (int mark : student.getMarks()) {
            average += mark;
        }
        average /= student.getMarks().length;
        return average;
    }

    public double findMinMark(Student student) {
        int min = 1000;
        for (int mark : student.getMarks()) {
            if (min > mark) {
                min = mark;
            }
        }
        return min;
    }

    public double findMaxMark(Student student) {
        int max = 0;
        for (int mark : student.getMarks()) {
            if (max < mark) {
                max = mark;
            }
        }
        return max;
    }

    public Student findBestStudent() {
        Student student = null;
        double bestMark = 0;
        for (Student stud : studentRepository.findAll()) {
            if (stud != null) {
                if (bestMark < getAverageMark(stud)) {
                    bestMark = getAverageMark(stud);
                    student = stud;
                }
            }
        }
        return student;
    }

    public Student findWorstStudent() {
        Student student = null;
        double worstMark = 1000;
        for (Student stud : studentRepository.findAll()) {
            if (stud != null) {
                if (worstMark > getAverageMark(stud)) {
                    worstMark = getAverageMark(stud);
                    student = stud;
                }
            }
        }
        return student;
    }

    public boolean isDeserveScholarship(Student student) {
        if (getAverageMark(student) >= 75 && findMinMark(student) >= 60)
            return true;
        return false;
    }

    public void printDeserveScholarship(Student student){
        if (isDeserveScholarship(student) == true) {
            System.out.println("Student deserve a scholarship");
        }
        else{
            System.out.println("Student don`t deserve a scholarship");
        }
    }
}
