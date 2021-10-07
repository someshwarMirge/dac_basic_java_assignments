// 7. Write a program to find the Factorial of a number using recursion?
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int fact=1;
        fact = factorial(n,fact);

        System.out.println("Factorial of " + n + " is " + fact);
    }
    static int factorial(int n,int fact) {
        if (n == 0) {
            return fact;
        }else {
            fact = fact * n;
            n--;
            return factorial(n,fact);
        }
    }
}
