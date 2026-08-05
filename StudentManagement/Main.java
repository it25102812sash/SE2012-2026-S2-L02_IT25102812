import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        input.nextLine(); 
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Student ID: ");
            String id = input.nextLine();

            System.out.print("Enter Student Name: ");
            String name = input.nextLine();

            students[i] = new Student(id, name);
        }

        System.out.println("\n~~~Student Details ~~~");

        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
            System.out.println();
        }

            }
}