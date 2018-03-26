class TestTryCatch
{
	public static void main(String...a)
	{
		try
		{
			int x=56/0;
		}
		finally
		{
			System.out.println("Hello");
		}
	}
}