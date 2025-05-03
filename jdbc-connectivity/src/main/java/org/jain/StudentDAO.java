/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.jain;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author amanjain
 **/
public class StudentDAO {
    private static final String url = "jdbc:postgresql://localhost:5432/java-learning";
    private static final String user = "amanjain";
    private static final String password = "amanjain";

    public void insertStudent(Student student){
        String sql = "INSERT INTO students (roll, name) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);) {

            stmt.setInt(1, student.getRoll());
            stmt.setString(2, student.getName());
            stmt.executeUpdate();

            System.out.println("Student added: " + student);
        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }

    public List<Student> readAllStudents(){
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while(rs.next()){
                students.add(new Student(rs.getInt("roll"), rs.getString("name")));
            }
        } catch (SQLException e) {
            System.out.println("Read failed: " + e.getMessage());
        }
        return students;
    }

    public void updateStudent(Student student) {
        String sql = "UPDATE students SET name = ? WHERE roll = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getRoll());
            int rows = stmt.executeUpdate();
            System.out.println("Student updated: " + student);

        } catch (SQLException e) {
            System.out.println("Update failed: " + e.getMessage());
        }
    }

    public void deleteStudent(int roll) {
        String sql = "DELETE FROM students WHERE roll = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, roll);
            int rows = stmt.executeUpdate();
            System.out.println("Deleted student with roll: " + rows);

        } catch (SQLException e) {
            System.out.println("Delete failed: " + e.getMessage());
        }
    }

}
