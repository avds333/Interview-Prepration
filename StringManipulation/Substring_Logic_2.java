import java.io.BufferedReader;
import java.io.InputStreamReader;
class Substring_Logic_2
{
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  String user,subUser;
  int flag;
  Substring_Logic_2()
  {
     try{
     System.out.println("Enter the string: ");
     user=br.readLine();
     System.out.println("Enter the substring : ");
     subUser=br.readLine();
     for(int i=0;i<user.length();i++)
     {
       //flag=0;
       for(int j=0;j<subUser.length();j++)
       {
         if(user.charAt(i)==subUser.charAt(j))
	 {
	   flag++;  
	 }
       }
       if(flag==subUser.length())
       {
         System.out.println("Substring found.");
         break;
       }
     }
     if(flag!=subUser.length())
     {
       System.out.println("Substring not found.");
     }
  }catch(Exception e)
  {
    e.printStackTrace();
  }
  }
  public static void main(String...a)
  {
    new Substring_Logic_2();
  }
}
