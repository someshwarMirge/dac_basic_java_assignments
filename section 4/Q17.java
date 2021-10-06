// 17.  Write a program to check whether a given number is a Strong Number or not?
// Note : If sum of factorial of each digit of a number is equal to that number, then that number is called strong number.
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number to check if its strong :");
        int entered_number=scan.nextInt();
        int backup=entered_number;
        int digit=0,sum=0;
        while(entered_number>0){
            digit=entered_number%10;
            sum=sum+factorial(digit);
            entered_number=entered_number/10;
        }
        if(backup==sum){
            System.out.println(backup+" is Strong Number.");
        }else{
            System.out.println(backup+" is Not Strong Number.");
        }
    }
    static int factorial(int x){
        int fact=1;
        for(int i=x;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
}
