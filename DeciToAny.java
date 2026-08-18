
import java.util. Scanner;
public class DeciToAny{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Digit ");
        int Digit=sc.nextInt();
        System.out.println("Enter the Base ");
        int Base=sc.nextInt();
        int rem=0;
        int i=0; 
         int sum=0;
        int result= Calculate(Digit,Base,rem,i, sum);
        System.out.println("The Result is: " + result);
    }
    
    public static int Calculate(int Digit, int Base, int rem, int i, int sum) {
           int P=1;
        while(Digit>0) {
         
            rem=Digit%Base;
            sum=sum+(rem*P);
            P=P*10;
            // sum= sum+rem*(int)Math.pow(10,i);So p = p * 10 is basically doing the job of i++ + Math.pow(10,i) together.
            Digit=Digit/Base;
            i++;
        }
        return sum;
    }
    
}
