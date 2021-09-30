// 5. Write a Java program to print the area and perimeter of a rectangle. Take required input using Scanner?

// Hint : 
// Area = width * height
// Perimeter = 2 * ( width + height)
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int height = sc.nextInt();
        int area = width * height;
        int perimeter = 2 * (width + height);
        System.out.println("Area of the rectangle is: " + area);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }
    
}
