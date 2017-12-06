import java.io.InputStreamReader;
import java.io.BufferedReader;
class LittleShino
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String user;
  int flag;
  String[] userArr;
  LittleShino()
  {
    try{
       user=br.readLine();
       userArr=user.split("\\s+");
       int num[]=new int[userArr.length];
       for(int i=0;i<num.length;i++)
       {
         num[i]=Integer.parseInt(userArr[i]);
       }
       for(int i=1,j=0;i<100;i++)
       {
	  if(num[0]%i==0 && num[1]%i==0)
	 {
	  flag++;
	 }
       }
       System.out.println(flag);
    }catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  public static void main(String...a)
  {
    new LittleShino();
  }
}
