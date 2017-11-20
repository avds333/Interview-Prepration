class Pattern_Decreasing
{
   Pattern_Decreasing()
   {
     int num=5;
     for(int i=num;i>=0;i--)
     {
       for(int j=0;j<=i;j++)
       {
         System.out.print("#");
       }
       System.out.println("");
     }
   }
   public static void main(String...a)
   {
     new Pattern_Decreasing();
   }
}
