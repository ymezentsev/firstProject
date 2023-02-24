package com.ua.robot.lesson13.repository;

import com.ua.robot.lesson13.domain.Student;

import java.util.Random;

public class StudentMemoryRepository {
    public static final int SIZE = 10;
    private Student[] students = new Student[SIZE];

    public StudentMemoryRepository() {
        fillStudentsWithRandomStudent();
    }

    public Student[] findAllStudents(){
        return students;
    }

    private void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                student.setId(i);
                students[i] = student;
                break;
            }
        }
    }

    private Student getRandomStudent() {
        final int MIN_GROUP_VALUE = 100;
        final int MAX_GROUP_VALUE = 120;

        Random random = new Random();

        String firstName = generateRandomName();
        String lastName = generateRandomName();
        String  group = Integer.valueOf(random.nextInt(MIN_GROUP_VALUE, MAX_GROUP_VALUE)).toString();
        double avgMark = (double) (random.nextInt(200, 500)) / 100;
        return new Student(0, firstName, lastName, group, avgMark);
    }

    private String generateRandomName() {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        final int MIN_NAME_LENGTH = 3;
        final int MAX_NAME_LENGTH = 12;

        Random random = new Random();
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < random.nextInt(MIN_NAME_LENGTH, MAX_NAME_LENGTH); i++) {
            name.append(ALPHABET.charAt(random.nextInt(0, ALPHABET.length())));
        }
        name.setCharAt(0, Character.toUpperCase(name.charAt(0)));
        return name.toString();
    }

    private void fillStudentsWithRandomStudent() {
        for (int i = 0; i < SIZE; i++) {
            Student student = getRandomStudent();
            addStudent(student);
        }
    }
}
