// 13. Write a Java program to print the ascii value of a given character?
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("The ascii value of " + ch + " is " + (int)ch);
    }
}
