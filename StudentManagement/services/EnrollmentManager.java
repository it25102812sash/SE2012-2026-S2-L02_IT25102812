package services;

import models.Student;

public class EnrollmentManager {

    private Student[] students;
    private int studentCount;

    public EnrollmentManager(int size) {
        students = new Student[size];
        studentCount = 0;
    }

    public void addStudent(String id, String name) {
        if (studentCount < students.length) {
            students[studentCount] = new Student(id, name);
            studentCount++;

            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student list is full.");
        }
    }

    public void displayStudents() {
        System.out.println("\n~~~ Student Details ~~~\n");

        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
            System.out.println();
        }
    }
}