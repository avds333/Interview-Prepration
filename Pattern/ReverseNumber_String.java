import java.util.Scanner;
class ReverseNumber_String
{
	String string;
	Scanner sc=new Scanner(System.in);
	ReverseNumber_String()
	{
	  System.out.println("Enter a number ");
	  string=sc.nextLine();
	  //using predefined method
	  char strArr[]=string.toCharArray();
	  System.out.println("Reverse number is");
	  for(int i=strArr.length-1;i>=0;i--)
	  {
	     System.out.print(strArr[i]);
	  }
	}
	public static void main(String ...a)
	{
	   new ReverseNumber_String();
	}
}

