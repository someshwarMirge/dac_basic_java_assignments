
// 14. Write a Java program that takes a year from user and print whether that year is a leap year or not.Hint : a leap year is divisible by 4 and (not div by 100 or  if div by both 100 &400)
import java.util.Scanner;
public class Q14 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year " + year + " is a leap year.");
                } else {
                    System.out.println("The year " + year + " is not a leap year.");
                }
            } else {
                System.out.println("The year " + year + " is a leap year.");
            }
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
 }   
}
