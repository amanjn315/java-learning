public class Student {

    String name;
    int rollNumber;

    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args){
        Student s1 = new Student("Aman", 101);
        s1.displayInfo();
    }
}
