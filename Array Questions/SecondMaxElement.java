class SecondMaxElement
{
	int[] arr={2,43,1,3};
	SecondMaxElement()
	{
		int largest,second;
		/* Here we are comparing first two elements of the
    * array, and storing the largest one in the variable
    * "largest" and the other one to "second" variable.
    */
		if(arr[0]<arr[1])
		{
			largest=arr[1];
			second=arr[0];
		}
		else
		{
			largest=arr[0];
			second=arr[1];
		}
		for(int i=2;i<arr.length;i++)
		{
			 /* If the current array element is greater than largest
       * then the largest is copied to "second" and the element
       * is copied to the "largest" variable.
       */
			if(largest<arr[i])
			{
				second=largest;
				largest=arr[i];
			}
			 /* If current array element is less than largest but greater
       * then second largest ("ssecond" variable) then copy the
       * element to "second"
       */
			else if(arr[i] > second && arr[i] != largest )
				second = arr[i];
		}
		System.out.println("Second Largest Element is="+second);
	}
	public static void main(String...a)
	{
		new SecondMaxElement();
	}
}