import java.util.Scanner ;
class BitToDec_method
{
  BitToDec_method()
  {
    Scanner sc=new Scanner(System.in);
    int user;
    System.out.println("Enter number :");
    user=sc.nextInt();
   user=Integer.bitCount(user);
   System.out.println("User is="+user);
  }
  public static void main(String...a)
  {
    new BitToDec_method();
  }
}
