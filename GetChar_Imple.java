/*
// Working perfectly.
class GetChar_Implementation
{
	GetChar_Implementation()
	{
	   String str=new String("122 2221");
	   int j=str.indexOf(" ");
	   System.out.println("Value of j = "+j);
	   char[] word1=new char[j];
	   str.getChars(0,j,word1,0);
	   System.out.println("Array content is : ");
	   for(char temp:word1)
	   {
 		System.out.print(temp);
	   }
 	   //Fetching the another word 
	   char word2[]=new char[str.length()-j-1];
	   str.getChars(str.length()-j-1,str.length(),word2,0);
	   System.out.println("Another string is =");
	   for(char temp:word2)                             
	   {
 		System.out.print(temp);
	   }
	}
	public static void main(String...a)
	{
		new GetChar_Implementation();
	}
}*/
class GetChar_Implementation
{
	GetChar_Implementation()
	{
	  String str=new String("1212 23323");
	  //finding where the space is occuring using indexOf()
	  int j=str.indexOf(" ");
	  char word1[]=new char[j];
	  str.getChars(0,j,word1,0);
	  for(char temp:word1)
	       System.out.print(temp);
          //Fetching another string.
	  char word2[]=new char[str.length()-j-1];
	System.out.println("Next String is:");
	  str.getChars(str.length()-j-1,str.length(),word2,0);
	  for(char temp:word2)
		System.out.print(temp);
      	}
	public static void main(String...a)
	{
		new GetChar_Implementation();
	}
}