import java.util.Scanner;

// 3. Write a menu driven billing system for a Snacks center, items available are Tea(Rs. 10), Samosa (Rs. 20), Sandwitch(Rs. 50), Green Tea (Rs. 15) etc. as follows - 

// ****Welcome to Snack Center *********
// 1. Tea (Rs. 10)
// 2. Green Tea (Rs. 15)
// 3. Samosa (Rs. 20)
// 4. Sandwitch (Rs. 50)
// 5. Generate Bill & Exit
// Enter your choice : 1
//    Enter quantity : 2
   
// 1. Tea (Rs. 10)
// 2. Green Tea (Rs. 15)
// 3. Samosa (Rs. 20)
// 4. Sandwitch (Rs. 50)
// 5. Generate Bill & Exit
// Enter your choice : 3
//   Enter quantity : 3
  
// 1. Tea (Rs. 10)
// 2. Green Tea (Rs. 15)
// 3. Samosa (Rs. 20)
// 4. Sandwitch (Rs. 50)
// 5. Generate Bill & Exit
// Enter your choice : 5

//  *****BILL****
//  Tea    2    20
//  Samosa 3    60
//  ------------
//  Total = 80
public class Q3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int tea_amount=0,samosa_amount=0,green_tea_amt=0,sandwitch_amt=0,amt=0,choice1;
        int choice2=1;
        System.out.println("****Welcome to Snack Center *********\n ");
        while(choice2==1){
        System.out.println("*** MENU ***\n1. Tea (Rs. 10)\n2. Green Tea (Rs. 15)\n3. Samosa (Rs. 20)\n4. Sandwitch (Rs. 50)\nEnter Choice : ");
        choice1=scan.nextInt();    
        switch(choice1){
            case 1:
            System.out.println("\nEnter Amount: ");
            amt=scan.nextInt();
            tea_amount=tea_amount+amt;
            break;

            case 2:
            System.out.println("\nEnter Amount: ");
            amt=scan.nextInt();
            green_tea_amt=green_tea_amt+amt;
            break;

            case 3:
            System.out.println("\nEnter Amount: ");
            amt=scan.nextInt();
            samosa_amount=samosa_amount+amt;
            break;

            case 4:
            System.out.println("\nEnter Amount: ");
            amt=scan.nextInt();
            sandwitch_amt=sandwitch_amt+amt;
            break;

            default:
                System.out.print("\n Oops ! wrong choice . Try Again !");
        }

        System.out.println("Want to select more?(press 1) Or proceed to checkout ?(press other than 1)");
        
        choice2=scan.nextInt();
        
    
    }
        System.out.println("\n *** Billing ***");
        System.out.println("\n Snack Name  Quantity  Total" );
        System.out.println("\n Tea "+tea_amount+"  "+tea_amount*10);
        System.out.println("\n Green Tea "+green_tea_amt+"  "+green_tea_amt*15);
        System.out.println("\n Samosa "+samosa_amount+"  "+samosa_amount*15);
        System.out.println("\n Sandwitch "+sandwitch_amt+"  "+sandwitch_amt*15);
        System.out.println("\n----------------------------------------");
        double total=(tea_amount*10+green_tea_amt*15+samosa_amount*15+sandwitch_amt*15);
        System.out.println("\n Total = "+total);
    }
    
}
