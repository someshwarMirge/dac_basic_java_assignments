// 7. Write a java program to calculate compound interest, get the required inputs 
// using Scanner ?
import java.util.Scanner;
import java.lang.Math;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double p=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double r=sc.nextDouble();
        System.out.println("Enter the time period");
        double t=sc.nextDouble();
        double ci=p*Math.pow((1+r/100),t);
        System.out.println("Compound interest is "+ci);        
    }
}
