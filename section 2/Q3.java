
// 3. Write a java program to calculate simple interest, get the required inputs 
// from Scanner ?
// Hint :  SI = (principal * rate * years)/100
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        int principal = sc.nextInt();
        System.out.println("Enter the rate of interest");
        int rate = sc.nextInt();
        System.out.println("Enter the number of years");
        int years = sc.nextInt();
        double simpleInterest = (principal * rate * years) / 100;
        System.out.println("The simple interest is " + simpleInterest);
    }
    
}
