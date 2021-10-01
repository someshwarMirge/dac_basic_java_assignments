// 9. Write a program to find the largest of three numbers?
   import java.util.Scanner; 
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers to find max:");
        int max;
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3)
            max=num1;
        else if(num2>num1 && num2>num3)
            max=num2;
        else
            max=num3;
    }
}
