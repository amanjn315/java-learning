package lambda_expression;

public class LambdaDemo {
    public static void main(String[] args){
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> b != 0 ? a / b : 0;

        System.out.println("Add: " + add.operate(10, 5));
        System.out.println("Subtract: " + subtract.operate(10, 5));
        System.out.println("Multiply: " + multiply.operate(10, 5));
        System.out.println("Divide: " + divide.operate(10, 5));
    }
}
