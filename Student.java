package models;

/**
 * Represents a student in the Student Management System.
 */
public class Student {

    private String id;
    private String name;

    /**
     * Creates a Student object.
     *
     * @param id Student ID
     * @param name Student Name
     */
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the student ID.
     *
     * @return student ID
     */
    public String getId() {
        return id;
    }

    /**
     * Returns the student name.
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the student details as a string.
     *
     * @return student information
     */
    @Override
    public String toString() {
        return "Student ID: " + id + "\nStudent Name: " + name;
    }
}