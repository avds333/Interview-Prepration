import java.io.BufferedReader;
import java.io.InputStreamReader;
class Fast_IO
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String s1;
  Fast_IO()
  {
    try{
       // String sl=br.readLine();
	//String[] tok=sl.split("");
       /* for(int i=0;i<tok.length;i++)
	{
	   System.out.println(i+"=>"+tok[i]);
	}*/
	while((s1=br.readLine())!=null)
	{
	  System.out.println(s1);
	}
    }catch(Exception e)
    {
      
    }
  }
  public static void main(String...a)
  {
    new Fast_IO();
  }
}
