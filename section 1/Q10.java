// 10. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers received from command line?

// // double x = Double.parseDouble(args[0]);


public class Q10 {
    public static void main(String[] args) {
        System.out.println("Sum is "+ (Double.parseDouble(args[0]) + Double.parseDouble(args[1])));
        System.out.println("Substraction is "+ (Double.parseDouble(args[0])-Double.parseDouble(args[1])));
        System.out.println("Multiplication is "+ (Double.parseDouble(args[0]) * Double.parseDouble(args[1])));
        System.out.println("Division is "+ (Double.parseDouble(args[0]) / Double.parseDouble(args[1])));
    }
}
