import java.util.Scanner;
class BinToDec
{
   Scanner sc=new Scanner(System.in);
   int user,rem,i=0;
   double sum;
   BinToDec()
   {
     System.out.println("Enter number to convert from Binary to decimal:");
     user=sc.nextInt();
     while(user!=0)
     {
       rem=user%10;
       user=user/10;
       sum=sum+(rem*Math.pow(2,i));
       i++;
     }
     System.out.println("Decimal is="+(int)sum);
   }
   public static void main(String...a)
   {
     new BinToDec();
   }
}
