import java.util.Scanner;

// 2. Create a class Circle, it will have only one constructor which accepts radius as an argument. Write two methods in the class - calcuateArea(), calculatePermiter(). 
// Write test class to test method calls.

// class Circle{
//   int rad;
//   Circle(int r){this.rad = r;}
//   double calArea(){}
//   double calPerimeter(){}
// }

public class Q2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter radius of Circle to calc Circumference and Area:");
        int rad=scan.nextInt();
        Circle c=new Circle(rad);
        System.out.println("Area is "+c.calArea());
        System.out.println("circumference is "+c.calPerimeter());

    }
    
}
