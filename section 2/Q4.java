// 4. Write a program to calculate the monthly in hand salary of an employee : 
// 	take input for basic salary,
// 	HRA is 40% of basic salary,
// 	PF amount to be deducted is 12% of basic,
// 	Medical allowance is Rs 1200 per month, 
// 	Traveling allowance is Rs 800 per month,
// 	Professional tax to be deducted is Rs 300.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary");
        double base_salary=sc.nextDouble();
        double hra=base_salary*0.4;
        double pf=base_salary*0.12;
        double medical=1200;
        double travel=800;
        double professional=300;
        double total=base_salary+hra+pf+medical+travel-professional;
        System.out.println("The monthly salary is "+total);
        
    }
}
