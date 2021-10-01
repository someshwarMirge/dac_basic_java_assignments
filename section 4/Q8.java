// 8. Write a program to make such a pattern like right angle triangle with number increased by 1 as shown below : 
// 1
// 2 3
// 4 5 6
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows");
       int rows = sc.nextInt();
       int num = 1;
       for(int i=1;i<=rows;i++){
           for(int j=0;j<i;j++){
               System.out.print(num+" ");
               num++;
           }
           System.out.println("");
       } 
    }
}