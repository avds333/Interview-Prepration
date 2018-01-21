import java.io.BufferedReader;
import java.io.InputStreamReader;
class Array_Rotation
{
  int user[]={23,232,3,3,2,434,5};
  int d=2;
  int temp[];
  int j;
  Array_Rotation()
  {
    try
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    temp=new int[2];
    for(int i=0,j=d;i<7;i++,j++)
    {
      // user[i]=Integer.parseInt(br.readLine());    
      int temp=user[i];
      user[j]=temp;
   }
    for(int i=0;i<user.length;i++)
    {
      System.out.print(user[i]+" ");
    }
    }catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  public static void main(String...a)
  {
   new Array_Rotation();
  }
}
