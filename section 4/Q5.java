
// 5. Write a program to display the pattern like right angle triangle using an asterisk as shown below:

// *
// **
// ***
// ****
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
