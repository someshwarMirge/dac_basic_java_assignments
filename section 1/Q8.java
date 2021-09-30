// 8. Write a java program to convert temperature from celsius to fahrenheit, get input from command line ?
// 	Hint : F = (9*C/5) + 32
public class Q8 {
    public static void main(String[] args) {
        double celsius = Double.parseDouble(args[0]);
        double fahrenheit = (9 * celsius / 5) + 32;
        System.out.println(celsius + " degree celsius is " + fahrenheit + " degree fahrenheit");
    }
    }

