import java.util.Scanner;

// 1. Write a java program to print first 10 natural number using recursion?
public class Q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scan.nextInt();
        printNaturalNumber(n);
    }
    
    public static void printNaturalNumber(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNaturalNumber(n - 1);
    }
}
