package com.xgileit.learning.student.controller;

/**
 * This is the class containing the student fields
 */
public class Student {

    int studentId;
    String firstName;
    String lastName;
    String address;

    //parameterized constructor
    public Student(int studentId, String firstName, String lastName, String address) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    //NoArgs constructor
    public Student() {
    }

    //getters and setters

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //override the toString method
    @Override
    public String toString() {
        return "First name = " + firstName + "\n"
                + "Last name = " + lastName + "\n"
                + "Address = " + address + "\n";
    }
}