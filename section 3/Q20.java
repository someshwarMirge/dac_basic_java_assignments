
// 20. Write a program to read 5 numbers from user, print the second highest number?
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++) {
            System.out.println("Enter number "+(i+1));
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int secondMax = arr[0];
        for(int i=0;i<5;i++) {
            if(arr[i]>max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second highest number is "+secondMax);
    }
}
