package Slot14_Lab;

import java.lang.reflect.Array;
import java.util.*;

public class StudentManager /*extends Student*/ {
    private static final int MAX_STUDENTS = 100;
    private static Student[] studentArray = new Student[MAX_STUDENTS];
    private static int studentCount = 0;
    private static Scanner scanner = new Scanner(System.in);
//    public StudentManager(int id, String name, String date, String address, double gpa) {
//        super(id, name, date, address, gpa);
//    }


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

    }
    private static void editStudentById() {

    }
    private static void deleteStudentById() {

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


