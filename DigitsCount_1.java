

//  Digits counting



public class DigitsCount_1 {
    public static void main(String[] args) {
     
        int x=105450;

        int count=0;
        while( x!=0){
        x=x/10;
        count++;
        }
             System.out.println(count);
    }
}



// import java.util.Scanner;
// public class Digits {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the number:");
//         int x=sc.nextInt();
//           String str = Integer.toString(x);
//           for(int i=0; i<str.length(); i++){
//             System.out.println(str.charAt(i));
//           }

//     }
// }
