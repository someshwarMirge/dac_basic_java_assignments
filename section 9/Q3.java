import java.util.Scanner;

// 3. Write a program to calculate the product of two integers using recursion? (Multiplication & Division operators are not allowed)

public class Q3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=scan.nextInt();
        System.out.println("Enter the second number");
        int b=scan.nextInt();
        System.out.println("The product of "+a+" and "+b+" is "+product(a,b));

    }
    static int product(int a,int b){
        if(b==0)
            return 0;
        else
            return a+product(a,b-1);
    }
}
