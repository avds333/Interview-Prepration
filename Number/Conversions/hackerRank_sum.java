import java.util.*;
import java.io.*;
class Sum_MinMax
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String user;
  String user_arr[];
  long[] userInt;
  long[] cntr;
  long sum,max,min;
  
  Sum_MinMax()
   {
     try{
		 System.out.println("Check 0");
        user=br.readLine();
		System.out.println(user.length());
        user_arr=user.split("\\s+"); 
		System.out.println("SD="+user_arr.length);
        userInt=new long[user_arr.length];
		userInt[0]=max=min=sum=Long.parseLong(user_arr[0]);
		System.out.println("sdw"+userInt.length);
        for(int i=1;i<user_arr.length;i++)
        {
		 System.out.println("Check 2 ");
         userInt[i]=Long.parseLong(user_arr[i]);
         if(userInt[i]>max)
             max=userInt[i];
         if(userInt[i]<min)
             min=userInt[i];
         sum+=userInt[i];
        }
	   System.out.println("Check 3");
       System.out.println((sum-max)+" "+(sum-min));
     }catch(Exception e)
     {
		 e.printStackTrace();
	 }
   }
public static void main(String...a)
   {
     new Sum_MinMax();
   }
}