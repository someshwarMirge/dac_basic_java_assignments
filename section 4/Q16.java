//16. Write a program to check whether a number is a palindrome or not.
// Note: If reverse of a number is same as that of number , then it is called palindrome. eg. 11, 151, 121,
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("**** Guys so we are checking palindrome here ****");
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
        if(reverse==backup)
        {
            System.out.println("So number is palindrome");
        }else{
            System.out.println("No Its not a palindrome.");
        }
    }
}
