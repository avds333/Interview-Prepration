import java.io.InputStreamReader;
import java.io.BufferedReader;
class Empty_Triangle
{
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  int user;
  Empty_Triangle()
  {
     try{
     System.out.println("Enter rows");
     user=Integer.parseInt(br.readLine());
     for(int i=0;i<user;i++)
     {
       for(int j=user;j>i;j--)
       {
         System.out.print("\t");
       }
       for(int k=0;k<=i;k++)
       {
          System.out.print("\t#");
       }
       for(int m=1;m<=i;m++)
       {
          System.out.print("\t#");
       }
       System.out.println("");
     }
     }catch(Exception e)
     {
       e.printStackTrace();
     }
  }
  public static void main(String...a)
  {
    new Empty_Triangle();
  }
}
