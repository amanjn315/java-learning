/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.jain;

import java.util.List;
import java.util.Scanner;

/**
@author amanjain
**/public class Main {
    public static void main(String[] args){
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n=== Student Management Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Update Student Name");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter roll number: ");
                    int rollAdd = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter name: ");
                    String nameAdd = sc.nextLine();
                    service.addStudent(new Student(rollAdd, nameAdd));
                    break;
                case 2:
                    List<Student> students = service.getAllStudents();
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("Student List:");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter roll number to update: ");
                    int rollUpdate = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    service.updateStudentName(rollUpdate, newName);
                    break;
                case 4:
                    System.out.print("Enter roll number to delete: ");
                    int rollDelete = sc.nextInt();
                    service.deleteStudent(rollDelete);
                    break;
                case 5:
                    System.out.println("Exiting. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
