// 2. Write a java program to read 10 numbers from keyboard and find their  sum and average?
import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] num=new double[10];
    double sum = 0.0;
    double avg = 0.0;
    System.out.println("Enter 10 numbers");
    for(int i=0;i<10;i++) {
        num[i] = sc.nextInt();
       sum=sum+num[i];
    }
    avg=sum/10;
    System.out.println("Sum of the numbers is "+sum);
    System.out.println("Average of the numbers is "+avg);

}
}
