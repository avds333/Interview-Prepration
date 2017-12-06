import java.util.Scanner;
class Bits
{
    
    Scanner sc=new Scanner(System.in);
    int input,cntr;
    Bits()
    {
        
        try{
            while(sc.hasNext())
            {
              input=sc.nextInt();
              cntr=input & (input-1);
              System.out.println(cntr);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String...a)
    {
        new Bits();
    }
}