// 1. Write a program to take "name" from user using Scanner and greet as shown below-

// >> Enter your name : Shakir
// Hello Shakir , Welcome to Java World.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " , Welcome to Java World.");
    }
}
    
