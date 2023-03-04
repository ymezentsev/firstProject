package com.ua.robot.workStudents.repository;

import com.ua.robot.workStudents.domain.Student;

import java.util.Random;

public class StudentMemoryRepository implements StudentRepository {
    public static final int SIZE = 10;
    private Student[] students = new Student[SIZE];

    public StudentMemoryRepository() {
        fillStudentsWithRandomStudent();
    }

    public Student[] findAll() {
        return students;
    }

    public void save(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                student.setId(i);
                students[i] = student;
                break;
            }
        }
    }

    private void fillStudentsWithRandomStudent() {
        for (int i = 0; i < SIZE; i++) {
            Student student = getRandomStudent();
            save(student);
        }
    }

    private Student getRandomStudent() {
        final int MIN_GROUP_VALUE = 100;
        final int MAX_GROUP_VALUE = 120;

        Random random = new Random();

        String firstName = generateRandomName();
        String lastName = generateRandomName();
        String group = Integer.valueOf(random.nextInt(MIN_GROUP_VALUE, MAX_GROUP_VALUE)).toString();

        int[] marks = new int[Student.NUMBER_OF_SUBJECTS];
        for (int i =0 ; i<marks.length; i++){
            marks[i] = random.nextInt(30, 101);
        }

        return new Student(0, firstName, lastName, group, marks);
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


}
