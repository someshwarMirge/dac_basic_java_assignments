import java.util.Scanner;

// 6. Write a program to find the sum of digits of a number using recursion?
public class Q6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=scan.nextInt();
        int sum=0;
        sum=sumDigit(n,sum);
        System.out.println("Sum of digits of "+n+" is "+sum);

    }
    static int sumDigit(int n,int sum){
        
        if(n==0){
            return sum;
        }else if(n<9){
            
            return sum+n;
         } else{
            sum=sum+n%10;
            return sumDigit(n/10,sum);
        }
        
    }
}
