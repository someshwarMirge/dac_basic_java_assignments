import java.util.Scanner;

// 8. Write a Java program to find the duplicate values of an array of integer values?
public class Q8 {
    
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=scan.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<size;i++)
    {
        arr[i]=scan.nextInt();
    }
    for(int i=0;i<size;i++)
    {
        for(int j=i+1;j<size;j++)
        {
            if(arr[i]==arr[j])
            {
                System.out.println("Duplicate value is "+arr[i]);
            }
        }
    }
           
}
}