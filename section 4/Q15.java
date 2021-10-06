// 15. Write a program to display the number in reverse order.
import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number to print reverse of it:");
        int number=scan.nextInt();
        int backup=number;
        int reverse=0,digit=0;
        while(number >0 )
        {
            digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;
        }
        System.out.println("Reverse of "+backup+" is "+reverse);
    }
}
