// 6. Write a Java program to print the area and perimeter of a circle. Take required input using Scanner?

// Hint : 
// Area = Math.PI * radius * radius
// Perimeter = 2* Math.PI* radius
import java.util.Scanner;
import java.lang.Math;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double radius=sc.nextDouble();
        double area=Math.PI*radius*radius;
        double perimeter=2*Math.PI*radius;
        System.out.println("Area of circle is:"+area);
        System.out.println("Perimeter of circle is:"+perimeter);
    }
    
}
