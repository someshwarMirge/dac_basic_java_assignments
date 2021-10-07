// 4. Write a Java program to copy an array to another by iterating the array?

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
       int[] arr1 = new int[size];
       for(int i=0;i<size;i++)
       {
           arr1[i] = arr[i];
       }
    
       System.out.println("\nThe array is copied ");

    }
}
