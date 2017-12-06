import java.io.InputStreamReader;
import java.io.BufferedReader;
class Negative_Positive
{
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  int user;
  Negative_Positive()
  {
     try{
     System.out.println("Enter number: ");
     user=Integer.parseInt(br.readLine());
     if(user<0.0)
     {
       System.out.println("Number is negtive");
     }
     else
     {
       System.out.println("Number is positive.");
     }
    }catch(Exception e)
    {
     
    }
  }
  public static void main(String...a)
  {
    new Negative_Positive();
  }
}
