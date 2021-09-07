package com.xgileit.learning.student.service;

import com.xgileit.learning.student.controller.Student;
import com.xgileit.learning.student.exceptions.StudentNotFoundException;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides implementation for the student management service to perform CRUD operation on student
 */

public class StudentManagementServiceImpl implements StudentManagementService {


    Map<Integer, Student> studentMap = new HashMap<>();

    @Override
    public String addStudent(Student student) {
        studentMap.put(student.getStudentId(), student);
        return "Student added";
    }

    @Override
    public String findStudentByStudentId(int studentId) {
        if (studentMap.containsKey(studentId) == false) {
            throw new StudentNotFoundException("Student is not found");
        }
        return "student: " + studentId + "found";
    }

    @Override
    public Map<Integer, Student> listAll() {
        return studentMap;
    }

    @Override
    public String updateStudent(Student student) {
        if (studentMap.containsKey(student.getStudentId())) {
            studentMap.replace(student.getStudentId(), student);
        } else {
            throw new StudentNotFoundException("Student is not found");
        }
        return "student updated";
    }

    @Override
    public String deleteStudentByStudentId(int studentId) {

        if (studentMap.containsKey(studentId) == false) {
            throw new StudentNotFoundException("Student is not found");
        }
        studentMap.remove(studentId);
        return "student deleted";
    }


}
