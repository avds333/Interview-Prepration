import java.util.Scanner;
class SubString
{
  String user,subUser;
  Scanner sc=new Scanner(System.in);
  int j=0;
  int flag;
  int temp_i;
  SubString()
  {
     try{
     System.out.println("Enter string :");
     user=sc.nextLine();
     System.out.println("Enter the substring: ");
     subUser=sc.nextLine();
     System.out.println("String and substring are : "+user+ ","+subUser );
     for(int i=0;i<user.length();i++)
     {
       flag=0;
       System.out.println("Check 1");
       temp_i=i;
       System.out.println("User -> "+user.charAt(i));
       System.out.println("subUser -> "+subUser.charAt(j));
       if(user.charAt(i)==subUser.charAt(j))
       {
          System.out.println("Check 2");
          while(j<subUser.length())
	  {
	    if(subUser.charAt(j)==user.charAt(i))
	    {
	      flag++;
	    }
	    i++;
	    j++;
	  }
	  if(flag==subUser.length())
	  {
	    System.out.println("Substring found");
	  }

       }
       
     }
     if(flag!=subUser.length())
     {
       System.out.println("Substring not  found ");
     } 
     }catch(Exception e)
     {
        System.out.println(e);
     }

  }
  public static void main(String...a)
  {
     new SubString();
  }
}

