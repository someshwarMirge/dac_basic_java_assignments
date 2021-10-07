// 8. Write a program to get the largest element of an array using recursion?
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The largest element is "+largest(arr,1,arr[0],arr.length));
    }
    public static int largest(int[] arr,int i,int max,int length)
    {
        if(i==length)
        {
            return max;
        }
        else
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            return largest(arr,i+1,max,length);
        }
    }
}
