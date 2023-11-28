package Slot14_Lab;

import java.lang.reflect.Array;
import java.util.*;

public class StudentManager {
    private static final int MAX_STUDENTS = 100;
    private static Student[] studentArray = new Student[MAX_STUDENTS];
    private static int studentCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudentById();
                    break;
                case 3:
                    deleteStudentById();
                    break;
                case 4:
                    sortStudentByGPA();
                    break;
                case 5:
                    sortStudentByName();
                    break;
                case 6:
                    showStudents();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 6.");
                    break;
            }
        } while (choice != 0);
    }
    private static void addStudent() {
        if (studentCount < MAX_STUDENTS) {
        
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự newline còn lại

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student date of birth: ");
            String dateOfBirth = scanner.nextLine();

            System.out.print("Enter student address: ");
            String address = scanner.nextLine();

            System.out.print("Enter student GPA: ");
            double gpa = scanner.nextDouble();

          
            Student newStudent = new Student(id, name, dateOfBirth, address, gpa);

           
            studentArray[studentCount] = newStudent;
            studentCount++;

            System.out.println("Student added successfully!");
        } else {
            System.out.println("Cannot add more students. Maximum limit reached.");
        }
    }
    private static void editStudentById() {
        System.out.print("Enter student ID to edit: ");
        int idToEdit = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (studentArray[i].getId() == idToEdit) {
                
                found = true;

                System.out.print("Enter new student name: ");
                String newName = scanner.nextLine();
                studentArray[i].setName(newName);

                System.out.print("Enter new student date of birth: ");
                String newDateOfBirth = scanner.nextLine();
                studentArray[i].setDate(newDateOfBirth);

                System.out.print("Enter new student address: ");
                String newAddress = scanner.nextLine();
                studentArray[i].setAddress(newAddress);

                System.out.print("Enter new student GPA: ");
                double newGpa = scanner.nextDouble();
                studentArray[i].setGpa(newGpa);

                System.out.println("Student information updated successfully!");
                break; 
            }
        }

        if (!found) {
            System.out.println("Student with ID " + idToEdit + " not found.");
        }
    }
    private static void deleteStudentById() {
        System.out.print("Enter student ID to delete: ");
        int idToDelete = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < studentCount; i++) {
            if (studentArray[i].getId() == idToDelete) {
                
                found = true;

                
                for (int j = i; j < studentCount - 1; j++) {
                    studentArray[j] = studentArray[j + 1];
                }

                studentCount--;

                System.out.println("Student with ID " + idToDelete + " deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + idToDelete + " not found.");
        }
    }

    private static void sortStudentByGPA() {
        Arrays.sort(studentArray, (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
    }

    private static void sortStudentByName() {
        Arrays.sort(studentArray, (s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName()));
    }

    private static void showStudents() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println(studentArray[i]);
        }
    }
}


