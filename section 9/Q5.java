import java.util.Scanner;

// 5. Write a recursive program to print Fibonacci Series for given number of terms?

//  Input number of terms for the Series (< 20) : 10                                
//  The Series are :                                                                
//  1  1  2  3  5  8  13  21  34  55 
public class Q5 {
            static int a = 1;
            static int b = 1;
            static int c = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms for the Series (< 20) : ");
        int n = scan.nextInt();
        if(n<20){
            System.out.println("The Series are : ");
        
        if(n==1){
            System.out.println("1");
        }
        if(n>2)
        {
            System.out.println("1 ");
            System.out.println("1 ");
            fibonacci(n-2);
        }
    }else{
        System.out.println("Please enter a number less than 20");
        
    }


    }
    static void fibonacci(int n) {
       if(n==0){
            return;
       }else
            c=a+b;
            System.out.print(c + "\n");
            a=b;
            b=c;
            fibonacci(n - 1);
    }
}


