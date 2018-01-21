class MaxElementArray
{
	int[] arr={90,1,2,43,1,3};
	MaxElementArray()
	{
			int max=arr[0];
			for(int i=0;i<=arr.length-1;i++)
			{
					if(max < arr[i])
						max=arr[i];
			}
			System.out.println("Find largest element : "+max);
	}
	public static void main(String...a)
	{
		new MaxElementArray();
	}
}