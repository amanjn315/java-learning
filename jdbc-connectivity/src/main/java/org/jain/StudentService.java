package org.jain;

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
}
