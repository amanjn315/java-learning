/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.jain.student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class StudentService {
    private final StudentDAO studentDAO = new StudentDAO();

    public boolean addStudent(Student student){
        if(student.getName() == null || student.getName().isBlank()){
            System.out.println("Name cannnot be empty.");
            return false;
        }
        studentDAO.addStudent(student);
        return true;
    }

    public List<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }

    public boolean updateStudentName(int roll, String newName){
        if(newName == null || newName.isBlank()){
            System.out.println(newName);
            return false;
        }
        studentDAO.updateStudentName(new Student(roll, newName));
        return true;
    }

    public void deleteStudent(int roll){
        studentDAO.deleteStudent(roll);
    }

    public void exportStudentsToFile(String filePath){
        List<Student> students = studentDAO.getAllStudents();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for(Student student : students){
                writer.write("Roll: " + student.getRoll() + ", Name: " + student.getName());
                writer.newLine();
            }
            System.out.println("Exported " + students.size() + ", students to " + filePath);
        } catch (IOException e){
            System.out.println("Failed to export: " + e.getMessage());
        }
    }

    public void importStudentFromFile(String filePath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            int insertedCount = 0;

            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                if(parts.length != 2) continue;

                try {
                    int roll = Integer.parseInt(parts[0].replaceAll("[^0-9]", "").trim());
                    String name = parts[1].split(":")[1].trim();

                    studentDAO.addStudent(new Student(roll, name));
                    insertedCount++;
                } catch (Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

            System.out.println("Imported " + insertedCount + " students from file.");
        } catch (IOException e){
            System.out.println("Failed to import: " + e.getMessage());
        }
    }
}
