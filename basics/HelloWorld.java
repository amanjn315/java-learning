public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        int age = 25;
        double height = 5.10;
        char firstInitial = 'A';

        System.out.println("My age is " + age);
        System.out.println("My height is " + height);
        System.out.println("My first initial is " + firstInitial);

        int num1 = 10;
        int num2 = 5;
        
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: "+ (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));
        System.out.println("Is x greater than y? " + (num1 > num2));
        System.out.println("Is x not equal to y? " + (num1 != num2));
    }
}
