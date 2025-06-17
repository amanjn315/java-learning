public class UseCustomException {
    public static void main(String[] args){
        int age = 15;
        
        try{
            checkAge(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be atleast 18");
        }
    }
}
