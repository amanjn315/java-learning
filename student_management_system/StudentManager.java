package student_management_system;

import java.util.HashMap;

public class StudentManager {
    HashMap<Integer, String> students = new HashMap<>();

    void addStudent(int roll, String name) throws DuplicateRollNumberException {
        System.out.println("Adding Student: " + name + " (" + roll + ")");
        if(students.containsKey(roll)){
            throw new DuplicateRollNumberException("Roll number already exists!");
        }
        students.put(roll, name);
        System.out.println("Student added!");
    }

    void displayAll(){
        System.out.println("All Students:");
        
        for(Integer roll : students.keySet()){
            System.out.println("Roll: " + roll + " - Name: " + students.get(roll));
        }
        
        if(students.isEmpty()){
            System.out.println("No student added!");
        }
    }

    void searchStudent(int roll){
        System.out.println("Searching for Roll " + roll + ":");
        if(students.containsKey(roll)){
            System.out.println("Found: " + students.get(roll));
        }
        else {
            System.out.println("Student not found!");
        }
    }

    void removeStudent(int roll){
        System.out.println("Removing Roll " + roll + ":");
        if(students.containsKey(roll)){
            students.remove(roll);
            System.out.println("Removed.");
        }
        else {
            System.out.println("Student not found!");
        }
    }
}
