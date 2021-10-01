// 9. Write a program to make such a pattern like a pyramid with an asterisk, as show below : 
//    * 
//   * * 
//  * * * 
// * * * *
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}        

