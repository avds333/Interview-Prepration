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
       j=0;
       flag=0;
       temp_i=i;
       System.out.println("User -> "+user.charAt(i));
       System.out.println("subUser -> "+subUser.charAt(j));
       if(user.charAt(i)==subUser.charAt(j))
       {
         System.out.println("* Value of I just after entering loop =>>>>>>>>"+i);
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
	    break;
	 }
       }
       System.out.println("** Value of I just after coming out of loop"+i);
       i=temp_i;
       System.out.println("*** Value of I temp after I "+temp_i);
       System.out.println("**** Value of manipulated I of temp_i =>"+i);
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

