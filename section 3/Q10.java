// 10. Write a program to find the smallest of five numbers?
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int min = a;
        if(b<min)
            min = b;
        if(c<min)
            min = c;
        if(d<min)
            min = d;
        if(e<min)
            min = e;
        System.out.println("The smallest number is "+min);
    }
    }
}
