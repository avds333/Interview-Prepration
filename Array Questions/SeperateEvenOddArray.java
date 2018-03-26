class SeperateEvenOddArray
{
    SeperateEvenOddArray()
    {
        int allArr[]={12,2,323,423,22312,12,2};
        int evenArray[]=new int[allArr.length];
        int oddArray[]=new int[allArr.length];
        int j=0,k=0;
        for(int i=0;i<allArr.length;i++)
        {

            if(allArr[i]%2==0)
            {
              evenArray[j]=allArr[i];
              j++;
            }
            else
            {
                oddArray[k]=allArr[i];
                k++;
            }
        }
        System.out.println("Even Array Elements are: ");
        for(int i=0;i<evenArray.length;i++)
        {
          System.out.print(" "+evenArray[i]);
        }
        System.out.println("\nOdd Array Elements are: ");
        for(int i=0;i<oddArray.length;i++)
        {
            if(oddArray[i]!=0)
            System.out.print(" "+oddArray[i]);
        }
    }
    public static void main(String...a)
    {
        new SeperateEvenOddArray();
    }
}
