package com.ua.robot.workStudents.repository;

import com.ua.robot.workStudents.domain.Student;

public interface StudentRepository {
    void save (Student student);
    Student[] findAll();
}
