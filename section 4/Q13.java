// 13. Write a program to determine whether a given number is prime or not?

import java.util.Scanner;

public class Q13 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=input.nextInt();
        int i,flag=0;
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Not a prime number");
        else
            System.out.println("Prime number");
    }
    
}
