class Check_Power_Two
{
   Check_Power_Two(int x)
   {
      int out= (x && ! (x & (x-1))); 
      System.out.println(out);
      
   }
   public static void main(String...a)
   {
     new Check_Power_Two(12);
   }
}
