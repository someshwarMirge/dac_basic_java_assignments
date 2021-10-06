
// 19. Write a program to print all numbers between 1 & 100 which are divisible by 3 and 5 both?

// import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        System.out.println("::: Printing numbers between 1 to 100 divisible by 3 and 5  :::");
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    
    }   
}
