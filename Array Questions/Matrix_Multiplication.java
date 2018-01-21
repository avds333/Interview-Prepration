import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Matrix_Multiplication
{
	int[][] arr_1;
	int[][] arr_2;
	int[][] store;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Matrix_Multiplication() throws IOException
	{
		System.out.println("Enter the base for matrix");
		int base=Integer.parseInt(br.readLine());
		arr_1=new int[base][base];
		arr_2=new int[base][base];
		store=new int[base][base];
		
		//Inserting elements into array
		for(int i=0;i<base;i++)
		{
			for(int j=0;j<base;j++)
			{
				arr_1[i][j]=Integer.parseInt(br.readLine());
			}
		}
		//Inserting elements into array
		for(int i=0;i<base;i++)
		{
			for(int j=0;j<base;j++)
			{
				arr_2[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(int i=0;i<base;i++)
		{
			for(int j=0;j<base;j++)
			{
				for(int k=0;k<base;k++)
				{
					store[i][j]=store[i][k]+arr_1[i][k]+arr_2[k][j];
				}
			}
		}
		for(int i=0;i<base;i++)
		{
			for(int j=0;j<base;j++)
			{
				System.out.print(store[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	static public void main(String...a)	throws IOException
	{
		new Matrix_Multiplication();
	}
}