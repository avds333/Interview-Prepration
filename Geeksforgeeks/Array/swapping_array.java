class Swapping_array
{
  public static void main(String...s)
  {
    int arr[]={5,7,9,10,12,78,45};
    //shifting elements from the index 2 to index 0
    int d=2;
    for(int i=d,j=0;i<arr.length;i++,j++)
    {
      int temp=arr[i];
      arr[j]=temp;
    }
    for(int i=0;i<arr.length-d;i++)
    {
      System.out.print(arr[i]+"  ");
    }
  }
}
