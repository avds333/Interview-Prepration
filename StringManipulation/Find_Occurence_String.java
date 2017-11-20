import java.io.BufferedReader;
import java.io.InputStreamReader;
class Find_Occurence_String
{
   //Declarations begins
   String sentence,string;
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   int j;
   int temp;
   int flag; //for iterating inside boolean condition
   int count;//For counting the characters , which matched.
   //Declarations ends
   //Logic Begins
   Find_Occurence_String()
   i{
     sentence="Life is so awesome , I cannt think of anything else , life , good ,life,life marvelous";
     string="life";
     System.out.println("Length is ="+sentence.length());
     for(int i=0;i<sentence.length();i++)
     {   
	temp=i;
	count=0;
	System.out.println("~~~~~~~~~~~~~First if statement: "+sentence.charAt(i));
       if(string.charAt(j)==sentence.charAt(i))
       {
          for(int k=0;k<string.length();k++)
	  {
	    System.out.println("!!!!!!!!!!!!!!!Second if statement: "+" I-> "+sentence.charAt(i)+  "K-> "+string.charAt(k));
	    if(string.charAt(k)==sentence.charAt(i))
	    {
	      count++;
	    }
	    if(count==string.length())
	    {
              flag++;	      
	      System.out.println("Value of flag= "+flag);
	    }
	    i++;
	  }
       }
       System.out.println("########Coming out of inside for loop i-> "+i);
     }
     if(flag!=0)
     {
       System.out.println("Substring found , occurence is => "+flag);
     }
   }
   //Logic Ends
   public static void main(String...a)
   {
      new Find_Occurence_String();
   }
}
