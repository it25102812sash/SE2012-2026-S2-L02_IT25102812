package mainapp;

import java.util.Scanner;
import services.EnrollmentManager;


public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Enter maximum number of students: ");
        int size = input.nextInt();
        input.nextLine();


        EnrollmentManager manager = new EnrollmentManager(size);


        int choice;


        do {


            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");


            choice = input.nextInt();
            input.nextLine();



            switch(choice) {


                case 1:

                    System.out.print("Enter Student ID: ");
                    String id = input.nextLine();


                    System.out.print("Enter Student Name: ");
                    String name = input.nextLine();


                    manager.addStudent(id, name);

                    break;



                case 2:

                    manager.displayStudents();

                    break;



                case 3:

                    System.out.print("Enter Student ID to search: ");
                    String searchId = input.nextLine();


                    manager.searchStudent(searchId);

                    break;



                case 4:

                    System.out.println("Exiting program...");

                    break;



                default:

                    System.out.println("Invalid choice.");

            }


        } while(choice != 4);



        input.close();
    }
}