import java.io.InputStreamReader;
import java.io.BufferedReader;
class Alphabet_Pattern
{
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   int rows;
   Alphabet_Pattern()
   {
     try{
     System.out.println("Enter number of rows: ");
     rows=Integer.parseInt(br.readLine());
     char a='A';
     for(int i=0;i<rows;i++)
     {
       for(int j=0;j<=i;j++)
       {
         System.out.print(a++);
       }
       System.out.println();
     }
     }catch(Exception e)
     {
       e.printStackTrace();
     }
   }
  public static void main(String...a)
  {  
    new Alphabet_Pattern();
  }
}
