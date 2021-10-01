import java.util.Scanner;

// 18. Write a Java program to check if character entered by user is a vowel, consonant or other character?
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else if (ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
            System.out.println("Consonant");
        } else {
            System.out.println("Other");
        }
    }
}
