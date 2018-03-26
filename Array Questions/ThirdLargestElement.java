class ThirdLargestElement
{
      int arr[]={5,4,3,2,1,60};
      int first=arr[0];
      int third = Integer.MAX_VALUE;
      int second = Integer.MIN_VALUE;
      ThirdLargestElement()
      {
          if(arr.length<3)
          {
              System.out.println("Can't process ahead , more than 2 elements required.");
          }
          for(int i=1;i<arr.length;i++)
          {
              //finding largest element
                  if(arr[i] > first)
                  {
                      third=second;
                      second=first;
                      first=arr[i];
                  }
                  else if(arr[i] > second )
                  {
                      third=second;
                      second=arr[i];
                  }
                  else if(arr[i] > third)
                  {
                    third=arr[i];
                  }
          }
          System.out.println("First largest no . is "+ first);
          System.out.println("Second largest no . is "+ second);
          System.out.println("Third largest no . is "+ third);
      }
      public static void main(String...a)
      {
          new ThirdLargestElement();
      }
}
