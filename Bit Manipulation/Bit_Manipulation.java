import java.util.Scanner;
class Bit_Manipulation
{
   Scanner sc=new Scanner(System.in);
   int cntr;
   Bit_Manipulation()
   {  
     System.out.print("Enter in binary form: \nValue X=");
     int x=sc.nextInt();
     System.out.print("Value Y=");
     int y=sc.nextInt();
     System.out.print(x+"&"+y);
     cntr=x&y;
     System.out.println("Output="+cntr);
   }
   public static void main(String...a)
   {
     new Bit_Manipulation();
   }
}
