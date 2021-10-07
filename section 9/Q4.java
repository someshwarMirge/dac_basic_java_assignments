import java.util.Scanner;

// 4. Write a program to calculate the power of any number using recursion?

public class Q4 {
    public static void main(String[] args) {
        Scanner scan=new   Scanner(System.in);
        System.out.println("Enter the number");
        int n=scan.nextInt();
        System.out.println("Enter the power");
        int p=scan.nextInt();
        System.out.println("The result is "+power(n,p));
    }
    public static int power(int n,int p){
        if(p==0)
            return 1;
        else
            return n*power(n,p-1);
    }
}
