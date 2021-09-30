// 7. Write a java program to calculate simple interest, get the required inputs from command line ?
//    Hint : SimpleInterest = (principal * rate * years)/100.0
public class Q7 {
    public static void main(String[] args) {
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double years = Double.parseDouble(args[2]);
        double simpleInterest = (principal * rate * years) / 100.0;
        System.out.println("Simple Interest is : " + simpleInterest);
    }
        
    }

