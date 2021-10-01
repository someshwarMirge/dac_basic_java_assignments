// 15. Write a java program to check if a given number is divisble by 3 and 5 ? 
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%3==0 && n%5==0)
            System.out.println("Number is divisible by 3 and 5");
        else
            System.out.println("Number is not divisible by 3 and 5");
    }
}
