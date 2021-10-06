// 1. Create a class Emp with fields like empId, name,dept,salary,address.
//   Write required constructors for initialization
//   Write a method displayEmpDetails() in the same class.
  
//   Write another test class , where you have to take emp details from user using Scanner and create object and call methods.
import java.util.Scanner;

import javax.print.event.PrintEvent;
public class Q1 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter employee ID:");
        int id=scan.nextInt();
        System.out.println("Enter employee name:");
        String name=scan.next();
        System.out.println("Enter employee department:");
        String dept=scan.next();
        System.out.println("Enter employee salary:");
        double salary=scan.nextDouble();
        System.out.println("Enter employee address:");
        String address=scan.next();
        System.out.println("Saving Data to Object:");
        Emp e=new Emp(id,name,dept,salary,address);
        e.show_data();
    }
}

    
