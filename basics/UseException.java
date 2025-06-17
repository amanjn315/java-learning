public class UseException {
    public static void main(String[] args){
        try {
            int num1 = 100, num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot Divide by Zero!");
        }
        finally {
            System.out.println("Execution Complete");
        }
    }
}
