// 11. Write a java program to read roll no, name and marks of three subjects and calculate the total, percentage and division. 

// Test Data :
// Input the Roll Number of the student :784
// Input the Name of the Student :James
// Input the marks of Physics, Chemistry and Computer Application : 70 80 90

// Expected Output :
// Roll No : 784
// Name of Student : James
// Marks in Physics : 70
// Marks in Chemistry : 80
// Marks in Computer Application : 90
// Total Marks = 240
// Percentage = 80.00
// Division = First
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the Roll Number of the student :");
        int rollno=sc.nextInt();
        System.out.println("Input the Name of the Student :");
        String name=sc.next();
        System.out.println("Input the marks of Physics, Chemistry and Computer Application :");
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        int computer=sc.nextInt();
        int total=physics+chemistry+computer;
        double percentage=(total/300.0)*100.0;
        String division;
        if(percentage>=90)
            division="First";
        else if(percentage>=80)
            division="Second";
        else if(percentage>=70)
            division="Third";
        else
            division="Fail";

        System.out.println("Roll No : "+rollno);
        System.out.println("Name of Student : "+name);
        System.out.println("Total marks:"+total);
        System.out.println("Percentage :"+percentage);
        System.out.println("Division :"+division);
    }
}
