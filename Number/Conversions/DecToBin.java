import java.util.Scanner;
class DecToBin
{
  Scanner sc=new Scanner(System.in);
  int user,rem;
  DecToBin()
  {
     System.out.println("Enter decimal number: ");
     user=sc.nextInt();
     while(user!=0)
     {
       rem=user%2;
       user=user/2;
       System.out.print(rem);
     }
  }
  public static void main(String...a)
  {
   new DecToBin();
  }
}
