import java.io.File;
class A_CreateFile
{
  public static void main(String...a)
  {
    try{
		File f=new File("E:\\Interview Prepration\\File IO\\One_File.txt");
		if(f.createNewFile())
		{
			System.out.println("File Created");
		}
		else
		{
			System.out.println("File Already Exist.");
		}
		System.out.println("++++++++++++++Printing System Information +++++++++++++++++++++");
		System.out.println("Printing Information using System.getProperty");
		System.out.println("Getting user Directory ->  "+System.getProperty("user.dir"));
		System.out.println("Getting os -> "+System.getProperty("os.name"));
	}catch(Exception e)
	{
	  e.printStackTrace();
	}
  }
}