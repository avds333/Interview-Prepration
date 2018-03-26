class RemoveDuplicateElements_Logic
{
    int[] arr={12,321,312,21,12,32};
    RemoveDuplicateElements_Logic()
    {
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr.length;j++)
        {
          if(arr[i]==arr[j])
          {
            arr[i]=-1;
            break;
          }
        }
      }
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]!=-1)
            System.out.println(arr[i]);
      }
    }
    public static void main(String...a)
    {
        new RemoveDuplicateElements_Logic();
    }
}
