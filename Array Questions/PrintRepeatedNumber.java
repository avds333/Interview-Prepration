//Program print the repeated number in Array
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class PrintRepeatedNumber
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrintRepeatedNumber() throws IOException
    {
        String x=br.readLine();
        String temp="";
    /*    char[] chars=x.toCharArray();
        int charNumber
        for(char ch:chars)    */
        int[] intArray=new int[x.length()];
        for(int i=0;i<x.length();i++)
          intArray[i]=Character.digit(x.charAt(i),10);

        int[] copyArray=intArray.clone();

        for(int i=0;i<intArray.length;i++)
        {
            for(int j=i+1;j<intArray.length;j++)
            {
                if(intArray[i]==copyArray[j])
                {
                    temp+=Integer.toString(intArray[i]);
                    break;
                }
            }
        }
        System.out.println("Repeated digits are : "+ temp);
    }
    public static void main(String...a) throws IOException
    {
      new PrintRepeatedNumber();
    }
}
