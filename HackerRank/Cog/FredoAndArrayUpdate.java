import java.io.InputStreamReader;
import java.io.BufferedReader;
class FredoAndArrayUpdate
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String user;
  int limit;
  int flag;
  String[] userArr;
  FredoAndArrayUpdate()
  {
    try{
	   limit=Integer.parseInt(br.readLine());
       user=br.readLine();
       userArr=user.split("\\s+");
       int num[]=new int[userArr.length];
       for(int i=0;i<limit;i++)
       {
         num[i]=Integer.parseInt(userArr[i]);
       }
	   //for(int i=0;i<limit;i++)
       //{
         System.out.println(num[limit-2]);
       //}
    }catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  public static void main(String...a)
  {
    new FredoAndArrayUpdate();
  }
}