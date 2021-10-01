// 1. Write a java program to print first 10 natural numbers and their sum?

public class Q1 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<10;i++){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("Sum of first 10 natural numbers is: "+sum);
    }
}
