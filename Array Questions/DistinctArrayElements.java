//Print Distinct Elements from Array
import java.io.InputStreamReader;
import java.io.BufferedReader;
class DistinctArrayElements
{
    DistinctArrayElements()
    {
        int arr[]={12,32,13,32,13,42,34,45,43};
        int arrCopy[]=arr.clone();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                        if(arr[i]==arr[j])
                        {
                            arr[j]=-1;
                        }
            }
        }
        System.out.println("Distinct Array Elements Are: ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=-1)
            System.out.print(" "+arr[i]);
        }

    }
    public static void main(String...a)
    {
        new DistinctArrayElements();
    }
}
