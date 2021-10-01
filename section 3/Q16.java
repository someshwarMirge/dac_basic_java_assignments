// 16. Write a java program to ask user to enter test marks of three subjects such as Phy, Chem, Math. Max marks for each subject is 100. Now calculate average of marks. Display following message based on average marks calculated - 
// avg < 30 : You are failed.
// avg >= 30 but < 60 : You passed with Second division
// avg >=60 but < 80 : You passed wirh Fiear division
// avg>=80 : You passed with First class distinction
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Phy Chem Math:");
        float phy = sc.nextFloat();
        float chem = sc.nextFloat();
        float math = sc.nextFloat();
        float avg;
        if(phy<0 || phy>100 || chem<0 || chem>100 || math<0 || math>100){
            System.out.println("Enter valid marks in range 0 to 100");
        }
        else{

        avg = (phy + chem + math) / 3;
        if(avg<30){
            System.out.println("You are failed");
        }
        else if(avg>=30 && avg<60){
            System.out.println("You passed with Second division");
        }
        else if(avg>=60 && avg<80){
            System.out.println("You passed with Fiear division");
        }
        else{
            System.out.println("You passed with First class distinction");
        }
        }
        
        
        
        
    }
}
