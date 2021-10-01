// 8. Write a program to find the largest of two numbers?
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2)
            System.out.println("Largest number is:"+num1);
        else
            System.out.println("Largest number is:"+num2);
    }
}
