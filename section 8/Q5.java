import java.util.Scanner;

// 5. Write a program to concatenate two arrays (merge two array to new one)?
//     a[] = {1,2,3}
// 	b[] = {4,5}
// 	c[] = {1,2,3,4,5}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array a");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter the size of array b");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        System.out.println("Enter the elements of array a");
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of array b");
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[a + b];
        for (int i = 0; i < a; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < b; i++) {
            arr3[i + a] = arr2[i];
        }
        System.out.println("The merged array is");
        for (int i = 0; i < a + b; i++) {
            System.out.print(arr3[i] + " ");
        }
        
    }
}
