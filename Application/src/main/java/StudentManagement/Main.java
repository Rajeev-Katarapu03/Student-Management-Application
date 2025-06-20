package StudentManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- Student Management System ----");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Sort and Display by Name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    if (sm.addStudent(new Student(id, name, course, age))) {
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Student ID already exists.");
                    }
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter New Course: ");
                    course = sc.nextLine();
                    System.out.print("Enter New Age: ");
                    age = sc.nextInt();
                    if (sm.updateStudent(id, name, course, age)) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    id = sc.nextInt();
                    if (sm.deleteStudent(id)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to search: ");
                    id = sc.nextInt();
                    Student student = sm.searchStudent(id);
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    sm.displayAll();
                    break;

                case 6:
                    sm.sortAndDisplayByName();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
        sc.close();
    }
}
