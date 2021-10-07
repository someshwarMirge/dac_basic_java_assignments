
// 1. Write a program to calculate average of numbers stored in an array?
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of elements of array :");
        int array_size=scan.nextInt();
        int sum=0;
        int[] num_store=new int[array_size];
        for(int i=0;i<array_size;i++){
            num_store[i]=scan.nextInt();
            sum=sum+num_store[i];
        }
        double average=sum/array_size;
        System.out.println("Average Of entered numbers is "+average);
       
    }
}
