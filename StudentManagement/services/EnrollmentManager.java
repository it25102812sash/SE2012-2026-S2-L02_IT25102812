package services;

import models.Student;
import models.Course;

public class EnrollmentManager {
    private Student[] students;
    private Course[] courses;
    private int studentCount;
    private int courseCount;

    public EnrollmentManager(int maxStudents, int maxCourses) {
        students = new Student[maxStudents];
        courses = new Course[maxCourses];
        studentCount = 0;
        courseCount = 0;
    }

    public void addStudent(String id, String name) {
        if (studentCount < students.length) {
            students[studentCount] = new Student(id, name);
            studentCount++;
        } else {
            System.out.println("Student list is full.");
        }
    }

    public void addCourse(String code, String title) {
        if (courseCount < courses.length) {
            courses[courseCount] = new Course(code, title);
            courseCount++;
        } else {
            System.out.println("Course list is full.");
        }
    }

    public void displayStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }

    public void displayCourses() {
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i]);
        }
    }
}