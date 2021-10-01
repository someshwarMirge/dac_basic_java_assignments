
// 11. Write a program to check whether a given number is a perfect number or not?

// Note : 
// Defintion of Perfect Number : sum of all divisor of the number is equal to the number itself. 
// eg.  Number = 6 is perfrect because
//      All positive divisor = 1 2 3, their sum=6 
	 

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
