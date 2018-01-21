class FixedElements
{
		int[][] arr={{1,2,1,3},{3,2,1,1},{23,23,2,32}};
		FixedElements()
		{	
			System.out.println("Size of array is ="+arr.length);
			for(int i=0;i<=arr.length;i++)
			{
				for(int j=0;j<=arr.length;j++)
				{
				System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
		}
		public static void main(String...a)
		{
			new FixedElements();
		}
}