package com.xgileit.learning.student.controller;

import com.xgileit.learning.student.service.StudentManagementServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * This class defines the APIs to send requests to the service and returns a response.
 */
@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentController {

    ArrayList<String> studentList = new ArrayList<>();
    StudentManagementServiceImpl studentManagementService = new StudentManagementServiceImpl();

    @GetMapping
    public String studentSelect() {
        return "Get method";
    }

    @PostMapping
    public String studentAdd() {
        return "Post method";
    }

    @PutMapping
    public String studentUpdate() {
        return "Update method";
    }

    @DeleteMapping
    public String studentDelete() {
        return "Delete method";
    }

    @RequestMapping(value = "/fetch/{id}")
    public String studentPath(@PathVariable("id") int studentId) {
        if (studentId == 2) {
            return "Student found";
        }
        return "Student not found";
    }

    @RequestMapping(value = "/all/{student}", method = RequestMethod.GET)
    public List listOfStudent(@PathVariable("studentId") int studentid, @RequestParam String name) {
        if (studentid == 2) {
            studentList.add(name);
        }
        return studentList;
    }

    //using the student object as a request
    @PostMapping(value = "/add")
    public String studentsAdd(Student student) {

        String response = studentManagementService.addStudent(student);
        return response;
    }

}
