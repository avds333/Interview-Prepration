class ThisMethod
{
	ThisMethod()
	{
		super(5);//this should be first statement
		System.out.println("Hello");
		
	}
	ThisMethod(int x)
	{
		//System.out.println(x);
	}
	public static void main(String...a)
	{
		ThisMethod tm=new ThisMethod();
	}
}