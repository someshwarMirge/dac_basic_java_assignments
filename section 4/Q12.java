// 12. Write a program to check whether a given number is an armstrong number or not?

// Note : When the sum of the cube of the individual digits of a number is equal to that number, the number is called Armstrong number. For Example 153 is an Armstrong number because 153 = 1^3 +5^3 + 3^3.

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to check whether its armstrong:\n");
        int number=input.nextInt();
        int digit=0,cube=0,sum=0;
        int backup_num=number;
        while(number>0){
            digit=number%10;
            cube=digit*digit*digit;
            sum=sum+cube;
            number=number/10;
        }
        if(sum==backup_num)
        System.out.println(backup_num+ " is armstrong.");
        else
        System.out.println(backup_num+" is not armstrong");
    }
}
