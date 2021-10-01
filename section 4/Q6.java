// 6. Write a program to display the pattern like right angle triangle with a number as shown below : 
// 1
// 12
// 123
// 1234
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows");
       int rows = sc.nextInt();
       for(int i=1;i<=rows;i++){
           for(int j=1;j<=i;j++){
               System.out.print(j);
           }
           System.out.println("");
       } 
    }
}
