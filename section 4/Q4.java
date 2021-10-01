
// 4. Write a program to calculate the factorial of the given number?
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        System.out.println("Factorial of the number is " + fact);
    }
}
