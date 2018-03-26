//Insert array at specified position.
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class CurdOperationInArray
{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      CurdOperationInArray() throws IOException
      {
        while(true)
        {
            System.out.println("\n1. Create Array. \n2. Display Array. \n3. Search Element. \n4. Insert At specified position. \n5. Delete from specified position."+
            "\n6. Update array element at specified index "
            );

        }
      }
      public static void main(String...a) throws IOException
      {
          new CurdOperationInArray();
      }
}
