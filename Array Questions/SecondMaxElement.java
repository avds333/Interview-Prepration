class SecondMaxElementArray
{
	int[] arr={2,43,1,3};
	SecondMaxElementArray()
	{
			int max=arr[0];
			int second_max=arr[1];
			for(int i=0;i<=arr.length-1;i++)
			{
					if(max < arr[i])
						max=arr[i];
			}
			for(int i=0;i<arr.length;i++)
			{
				if(second_max <= max && second_max < arr[i])   
					second_max=arr[i];
			}
			System.out.println("First  largest element : "+max);
			System.out.println("Second largest element : "+second_max);
	}
	public static void main(String...a)
	{
		new SecondMaxElementArray();
	}
}