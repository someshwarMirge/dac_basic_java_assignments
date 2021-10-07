import java.util.Scanner;

// 9. Write a Java program to find the common elements between two arrays of integers?
public class Q9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n=scan.nextInt();
        int[] arr1=new int[n];
        System.out.println("Enter the elements of first array");
        for(int i=0;i<n;i++)
        {
            arr1[i]=scan.nextInt();
        }
        System.out.println("Enter the size of second array");
        int m=scan.nextInt();
        int[] arr2=new int[m];
        System.out.println("Enter the elements of second array");
        for(int i=0;i<m;i++)
        {
            arr2[i]=scan.nextInt();
        }
        int[] arr3=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    arr3[k]=arr1[i];
                    k++;
                }
            }
        }
        System.out.println("Common elements are");
        for(int i=0;i<k;i++)
        {
            System.out.println(arr3[i]);
        }
        

    }
}
