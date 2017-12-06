import java.io.InputStreamReader;
import java.io.BufferedReader;
class Prime_Number
{
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  int user;
  int flag=0;
  Prime_Number()
  {
    try{
       System.out.println("Enter the number");
       user=Integer.parseInt(br.readLine());
       for(int i=2;i<=user/2;i++)
       {
         if(user%i==0)
	 {
	   flag=1;
	   break;
	 }
       }
       if(flag==0)
       {
         System.out.println("Number is prime.");
       }
       else
       {
         System.out.println("Number is not prime.");
       }
    }catch(Exception e)
    {
      System.out.println(e);
    }
  }
  public static void main(String...a)
  {
    new Prime_Number();
  }
}
