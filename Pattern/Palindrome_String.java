import java.util.Scanner;
class Palindrome_String
{
    Scanner sc=new Scanner(System.in);
    Palindrome_String()
    {
	System.out.println("Enter string");
	String str=sc.nextLine();
	String temp=str;
	int j=0;
	char strArr[]=str.toCharArray();
	char tempArr[]=new char[strArr.length];
	for(int i=strArr.length-1;i>=0;i--,j++)
	{
	   tempArr[j]=strArr[i];
	}
        String tempString=tempArr.toString();
	if(temp==tempString)
	{
	  System.out.println("Input is palindrome.");
	}
	else
	{
	  System.out.println("Input is not palindrome.");
	}
    }
    public static void main(String...a)
    {
        new Palindrome_String();
    }
}

