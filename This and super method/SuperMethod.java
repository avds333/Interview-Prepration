class Base
{
		Base()
		{
				System.out.println("Base Class.");
		}
		Base(int x)
		{
				System.out.println("Message from base class: "+x);
		}
}
class SuperMethod extends Base
{
	SuperMethod()
	{
		super(5);//this should be first statement
		System.out.println("Hello");
		
	}
	SuperMethod(int x)
	{
		//System.out.println(x);
	}
	public static void main(String...a)
	{
		SuperMethod tm=new SuperMethod();
	}
}