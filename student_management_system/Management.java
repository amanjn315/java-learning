package student_management_system;

import java.util.Scanner;

public class Management {
    public static void main(String[] args){
        StudentManager studentManager = new StudentManager();

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Student\n2. Remove Student\n3. Display All\n4. Search Student\n5. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Name: ");
                    String name = sc.nextLine();
                    try {
                        studentManager.addStudent(roll, name);
                    } catch(DuplicateRollNumberException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                
                case 2:
                    System.out.println("Roll Number: ");
                    studentManager.removeStudent(sc.nextInt());
                    break;

                case 3:
                    studentManager.displayAll();
                    break;

                case 4:
                    System.out.println("Roll Number: ");
                    studentManager.searchStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;
                
                default:
                    System.out.println("Invalid option");
            }
        } while (choice != 5);
        sc.close();
    }
}
