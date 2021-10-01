// 12. Write a java program to read temperature in centigrade and display a suitable message according to temperature state below :
// Temp < 0 then Freezing weather
// Temp 0-10 then Very Cold weather
// Temp 10-20 then Cold weather
// Temp 20-30 then Normal in Temp
// Temp 30-40 then Its Hot
// Temp >=40 then Its Very Hot

// Test Data :
// 42
// Expected Output :
// Its very hot.

import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in Celcius:");
        double temp_celcius=sc.nextDouble();
        if(temp_celcius<0){
            System.out.println("Freezing weather");

        }else if(temp_celcius>=0 && temp_celcius<=10){
            System.out.println("Very Cold weather");

        }else if(temp_celcius>10 && temp_celcius<=20){
            System.out.println("Cold weather");

        }else if(temp_celcius>20 && temp_celcius<=30){
            System.out.println("Normal in Temp");

        }else if(temp_celcius>30 && temp_celcius<40){
            System.out.println("Its Hot");

        }else if(temp_celcius>=40 ){
            System.out.println("Its very Hot");

        }else{
            System.out.println("Invalid Input");
        }
        
    }
}
