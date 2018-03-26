//Count frequency of the repeated charNumber
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class GetRepeatedFrequency
{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      GetRepeatedFrequency() throws IOException
      {
          String userInput=br.readLine();
          int count=0;
          int[] intArray=new int[userInput.length()];
          for(int i=0;i<intArray.length;i++)
              intArray[i]=Character.digit(userInput.charAt(i),10);//Character.digit(x.charAt(i),10)
          int[] copyArrayOccurence=new int[intArray.length];
            for(int i=0;i<intArray.length;i++)
            {
              for(int j=i+1;j<intArray.length;j++)
              {
                  count=0;
                  if(intArray[i]==intArray[j])
                  {
                      count++;
                      copyArrayOccurence[i]+=count;
                  }
              }
            }
            System.out.println("Output is: ");
            for(int i=0;i<intArray.length;i++)
            {
                System.out.println("Element is : "+intArray[i]+"\t\tOccurence => "+copyArrayOccurence[i]);
            }
      }
      public static void main(String...a) throws IOException
      {
          new GetRepeatedFrequency();
      }
}
