
import java.util.Scanner;
class DecToBin
{
  Scanner sc=new Scanner(System.in);
  int user,rem,add;
  DecToBin()
  {
    while(sc.hasNext())
    {
       System.out.println("Enter decimal number: ");
       user=sc.nextInt();
       add=0;rem=0;
       while(user!=0)
       {
        rem=user%2;
        user=user/2;
        add=add+rem;
        System.out.print(rem);
       }
       System.out.println("Addition is =>"+add);
    }
  }
  public static void main(String...a)
  {
   new DecToBin();
  }
}
