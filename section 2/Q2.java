// 2. Write a java program to take 5 numbers using Scanner and print the average ?

// >> Enter 5 numbers : 1 2 3 4 5
// Average = 3

// >> Enter 5 numbers : 2 3 5 7 9
// Average = 5.2
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int sum=0;
        System.out.println("Enter 5 numbers : ");
        for(int i=0;i<5;i++)
        {
            sum=sum+scan.nextInt();
        }
        System.out.println("Average = "+sum/5);
    
    }
}
