// 14. Write a program to display the first n terms of Fibonacci series. 

// Fibonacci series 0 1 2 3 5 8 13 .....
// Test Data :
// Input number of terms to display : 10
// Expected Output :
// Here is the Fibonacci series upto to 10 terms :
// 0 1 1 2 3 5 8 13 21 34

import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of terms of febonacci series:");
        int n=scan.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a);
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
