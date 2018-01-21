import java.io.BufferedReader;
import java.io.InputStreamReader;
class Hihi
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    Long tc,myBit,count;
    Long sum=new Long(0);
    Long input[];
    int k=0;
    
    
    Hihi()
    {
        try{
        //enter tc below
          tc=Long.parseLong(br.readLine());
          input=new Long[tc];
          for(int i=0;i<tc;i++)
          {
              input[i]=Long.parseLong(br.readLine());
          }
          while(k<tc)
          {
            myBit=new Long(0);
            myBit=myBit & (myBit+1);
            count++;
            System.out.println(count);
          }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String...a)
    {
        new Hihi();
    }
}
