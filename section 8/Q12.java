import java.util.Scanner;

// 12. Write a program to Sort strings in alphabetical order?
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings you want to sort");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter the strings");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Sorted strings are");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }
}
