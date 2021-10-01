// 6. Write a java program to read age of a person, check if he/she is eligible to cast vote or not?

import java.utils.Scanner;
public class Q6 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age=sc.nextInt();
        if(age > 18 )
        {
            System.out.println("eligible To Cast Vote");
        }else
        {
            System.out.println("Not eligible To Cast Vote");
        }
    }
    }
}
