public class NumUtil {
    public static double getPower(double x, int n){
        return Math.pow(x, n);
    }
    public static long getFactorial(int num){
        long fact=1;
        for(int i=num;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static boolean isPrime(int num){
        int i,m=0,flag=0;      
        int n=num;  
        m=n/2;      
        if(n==0||n==1){  
         //System.out.println(n+" is not prime number");  
         return false;    
        }else{  
         for(i=2;i<=m;i++){      
          if(n%i==0){      
           //System.out.println(n+" is not prime number");      
           flag=1;      
           break;      
          }      
         }      
         if(flag==0)  { return true; } 
         else{
             return false;
         } 
        }//end of else  

    }
    public static boolean isEven(int num){
        boolean state;
        if(num%2==0){
            state=true;
        }else{
            state=false;
        }
        return state;
    }
    public static boolean isOdd(int num){
        boolean state;
        if(num%2==1){
            state=true;
        }else{
            state=false;
        }
        return state;
    }
}
