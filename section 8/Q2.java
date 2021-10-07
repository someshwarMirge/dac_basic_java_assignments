import java.util.Scanner;

// 2. Write a program to reverse an array of elements?


public class Q2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of elements of array :");
        int array_size=scan.nextInt();
        int[] num_store=new int[array_size];
        int[] reverse=new int[array_size];
        for(int i=0;i<array_size;i++){
            num_store[i]=scan.nextInt();
        }
        System.out.println("Entered Array is :\n");
        for(int i=0;i<array_size;i++){
            System.out.print("Element["+i+"]="+num_store[i]+"\n");
        }
        for(int i=0;i<array_size;i++){
            reverse[i]=num_store[array_size-i-1];
        }
        System.out.println("Reverse Array is :\n");
        for(int i=0;i<array_size;i++){
            System.out.print("Element["+i+"]="+reverse[i]+"\n");
        }
    }
}
