import java.util.Scanner;
class Bits
{
    
    Scanner sc=new Scanner(System.in);
    int input;
	long a;
    Bits()
    {
        
        try{
            while(sc.hasNext())
            {
              a=sc.nextLong();
              sum=0;
              while(a>0)
			  {
				  if(a%2==1)
				  {
					  sum++
				  }
				  a=a/2;
			  }
              answer+=sum+"\n";			  
            }
			System.out.println(answer);
			sc.close();
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