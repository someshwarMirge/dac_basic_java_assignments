
// 7. Write a java program to read a number entered by user. Print -1 if  this number is negative, 1 if it is positive, 0 if it is neither positive nor negative?
import java.utils.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its positive negative or 0: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("1");
        } else if (num < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
    }
}
