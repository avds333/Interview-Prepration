import java.io.BufferedReader;
import java.io.InputStreamReader;
class Check_Two_Power
{
   BufferedReader br=new BufferedReader(new InputStreamReader());
   int num;
   Check_Two_Power()
   {
     try{
     System.out.println("Enter number to check if it is power of two");
     num=Integer.parseInt(br.nextInt());
     while(num%2==0)  num/=2;
     if(num==1)
     {
       System.out.println("Number is not in power of two:")
     }
     else
     {
        System.out.println("Number is not in power of two:");
     }
     }catch(Exception e)
     {
      e.printStackTrace();
     }
   }
   public static void main(String...a)
   {
     new Check_Two_Power();
   }
}
