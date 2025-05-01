package student_management_system;

public class Management {
    public static void main(String[] args){
        StudentManager studentManager = new StudentManager();

        
        try{
            studentManager.addStudent(101, "Aman");
            studentManager.addStudent(102, "Sara");
            studentManager.addStudent(101, "John");
        }
        catch(DuplicateRollNumberException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        
        studentManager.displayAll();
        studentManager.searchStudent(102);
        studentManager.removeStudent(102);
        studentManager.displayAll();
    }
}
