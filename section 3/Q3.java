// 3. Write a java program to accept two integers and check whether they are equal or not?
// >> Enter two integers : 15 15
//  first and second number are equal.
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==b)
            System.out.println("first and second number are equal.");
        else
            System.out.println("first and second number are not equal.");

    }
    
}
