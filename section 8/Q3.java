import java.util.Scanner;

// 3. Write a program to find out highest and second highest number in an array?

public class Q3 {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter array size:");
            int array_size=scan.nextInt();
            int num1[]=new int[array_size];
            System.out.println("Enter array elements :");
            for(int i=0;i<array_size;i++){
                num1[i]=scan.nextInt();
            }
            for(int i=0;i<num1.length;i++){
                for(int j=i+1;j<num1.length;j++){
                    int tmp=0;
                    if(num1[i]>num1[j]){
                        tmp=num1[i];
                        num1[i]=num1[j];
                        num1[j]=tmp;
                    }
                }
            }
            System.out.println("Highest number is "+num1[num1.length-1]);
            System.out.println("Second Highest number is "+num1[num1.length-2]);


    }
}
