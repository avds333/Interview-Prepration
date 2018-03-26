import java.util.HashSet;
class RemoveDuplicateElements
{
    HashSet<Integer> set=new HashSet<Integer>();
    RemoveDuplicateElements()
    {
      int[] arr={12,321,312,21,12,32};
      for(int i=0;i<arr.length;i++)
      {
        set.add(arr[i]);
      }
      for(Integer i:set)
      {
        System.out.println(i);
      }
    }
    public static void main(String...a)
    {
        new RemoveDuplicateElements();
    }
}
