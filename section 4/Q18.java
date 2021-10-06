// 18. Write a program to find the length of a string without using the library function?

import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        java.util.Scanner scan=new Scanner(System.in);
        System.out.println("Enter String without space to find Length :\n");
        String entered_string=scan.next();
        int count=0;
        char[] entered_string_char_array=entered_string.toCharArray();
        for(char c:entered_string_char_array)
        {
            count++;
        }
        System.out.println("Length of String is: "+count);
    }
}
