import java.util.Scanner;
class Scanner_Test
{
	Scanner sc=new Scanner(System.in);
	Scanner_Test()
	{
		int a=sc.nextInt();
		System.out .println(a);
		System.out.println(a[0]);
	}
	public static void main(String...a)
	{
		new Scanner_Test();
	}
}