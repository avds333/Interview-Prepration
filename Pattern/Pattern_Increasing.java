class Pattern_Increasing
{
     Pattern_Increasing()
     {
	int num=5,num_1=6,num_3=7;
	for(int i=0;i<num;i++)
	{
	  for(int j=0;j<=i;j++)
	  {
	     System.out.print("#");
	  }
	  System.out.println(" ");
	}

     }
     public static void main(String...a)
     {
        new Pattern_Increasing();
     }
}
