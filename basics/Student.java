public class Student {
    public static void main(String[] args){
        // int marks = 87;
        // giveRemarks(marks);

        // for(int i = 1; i <= 10; i++){
        //     System.out.println(i);
        // }

        // int i = 10;
        // while(i > 0){
        //     System.out.println(i--);
        // }

        // do {
        //     System.out.println(i);
        //     i--;
        // } while(i > 0);

        System.out.println(multiply(22, 7));
        System.out.println(multiply(3.14, 4));
    }

    public static void giveRemarks(int marks){
        if(marks >= 90)
            System.out.println("Outstanding");
        else if(marks >= 80)
            System.out.println("Excellent");
        else if(marks >= 70)
            System.out.println("Good");
        else
            System.out.println("Needs Improvement");
    }

    public static int multiply(int a, int b){
        return a * b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
}
