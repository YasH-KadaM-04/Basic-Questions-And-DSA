public class DigitFREQCount {

    public static int Count(int num , int Check ,int rem, int Count){
        while(num>0){
            
            rem=num%10;
            if(rem==Check){
                Count++;
            }
            num= num/10;
        }
        return Count;
    }
    public static void main(String[] args) {
      int num=98998999;
      int Check=9;
        int rem=0;      
        int Count=0;
        int result=Count(num,Check,rem,0);
        System.out.println(result);
    }


   
  
}
