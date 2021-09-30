//6. Write a java program to take three numbers from command line and print the average ?
//>> java Avg 5 6 4
//Average=5

public class Q6 {
  public static void main(String[] args) {
      System.out.println("Average of "+args[0]+" "+args[1]+" "+args[2]+" is "+((Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2]))/3));
  }  
}
