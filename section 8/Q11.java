import java.util.Scanner;
import java.util.Arrays;
public class Q11 {
    // 11. Write a program to Sort an array in ascending order? [Notes : Arrays.sort()]
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=scan.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("The unsorted array is");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The sorted array is");
        Arrays.sort(arr);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
