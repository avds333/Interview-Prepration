import java.io.BufferedReader;
import java.io.InputStreamReader;
class DecToBin
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    long user,count;
    DecToBin()
    {
           count=0;
           while(Long.parseLong(br.readLine())!=0)
           {
            user=user & (user-1);
            count++;
           }
           System.out.println(count);
    }

    public static void main(String...a)
    {
        new DecToBin();
    }
}





