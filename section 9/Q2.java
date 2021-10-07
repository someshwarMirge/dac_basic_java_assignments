import java.util.Scanner;
// 2. Write a java program to calculate the sum of numbers from 1 to N using recursion? 
public class Q2 {
 public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scan.nextInt();
        int sum=0;
        sum=sum+sum(n);
        System.out.println("The sum of numbers from 1 to "+n+" is "+sum);

 }   
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
}
}