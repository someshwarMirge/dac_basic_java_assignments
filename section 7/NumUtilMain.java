import java.util.Scanner;

public class NumUtilMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Choice:\n 1. Power 2. Get Factorial 3. isPrime 4. isEven 5.isOdd ");
        int choice=scan.nextInt();
       
        switch(choice){
            case 1:
            System.out.println("enter 2 number to calculate power;");
            double a=scan.nextDouble();
            int b=scan.nextInt();
            double result=NumUtil.getPower(a,b);
            System.out.print("Result = "+ result);
            break;

            case 2:
                System.out.print("Enter number to get factorial:");
                int in=scan.nextInt();
                long fact_result=NumUtil.getFactorial(in);
                System.out.print("Result = "+ fact_result);
            break;

            case 3:
            System.out.print("Check Number to see if its prime :");
            int num1=scan.nextInt();
            boolean prime_state=NumUtil.isPrime(num1);
            if(prime_state==true){
                System.out.println(num1+" is Prime");
            }else{
                System.out.println(num1+" is not  Prime");
            }
            break;

            case 4:
            System.out.print("Enter Number To check if its Even :");
            int num2=scan.nextInt();
            boolean even_state=NumUtil.isEven(num2);
            if(even_state==true){
                System.out.println(num2+" is Even");
            }else{
                System.out.println(num2+" is not  Even");
            }
            break;

            case 5:
            System.out.print("Enter Number To check if its Odd :");
            int num3=scan.nextInt();
            boolean odd_state=NumUtil.isOdd(num3);
            if(odd_state==true){
                System.out.println(num3+" is Odd");
            }else{
                System.out.println(num3+" is not  Odd");
            }
            break;


            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
