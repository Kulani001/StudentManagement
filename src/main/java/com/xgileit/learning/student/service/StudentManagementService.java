package com.xgileit.learning.student.service;

import com.xgileit.learning.student.controller.Student;

import java.util.Map;

public interface StudentManagementService {

    String addStudent(Student student);

    Map<Integer, Student> listAll();

    String updateStudent(Student student);

    String findStudentByStudentId(int studentId);

    String deleteStudentByStudentId(int studentId);
}
