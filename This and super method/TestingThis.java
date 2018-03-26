class TestingThis
{
		void fun()
		{
			this(5);
		}
		TestingThis(int x)
		{
			System.out.println("Value ="+x);
		}
		
		public static void main(String...a)
		{
			TestingThis oa=new TestingThis();
			oa.fun();
		}
}