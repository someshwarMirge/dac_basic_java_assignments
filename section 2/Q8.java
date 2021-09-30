// 8. Write a java program to read roll no, name and marks of three subjects and calculate the total and percentage. 

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
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of Student :");
        String name=sc.nextLine();
        System.out.println("Enter roll number of Student :");
        int roll=sc.nextInt();
        System.out.println("Enter marks in Physics:");
        int p_marks=sc.nextInt();
        System.out.println("Enter marks in Chemistry:");
        int c_marks=sc.nextInt();
        System.out.println("Enter marks in ComputerApplication:");
        int ca_marks=sc.nextInt();
        //output
        System.out.println("Name of Student :"+name);
        System.out.println("Roll number of Student :"+roll);
        System.out.println("Marks in Physics :"+p_marks);
        System.out.println("Marks in Chemistry :"+c_marks);
        System.out.println("Marks in ComputerApplication :"+ca_marks);
        System.out.println("Total marks of Student :"+(p_marks+c_marks+ca_marks));
        System.out.println("Percentage of Student :"+(p_marks+c_marks+ca_marks)*100/450+"%");
    }
}
