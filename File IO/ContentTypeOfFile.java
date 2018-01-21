import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
class ContentTypeOfFile
{
		ContentTypeOfFile()
		{
			Path p=Paths.get("D:\\Vibhor Dubey.pdf");
			try{
				String ContentType=Files.probeContentType(p);
				System.out.format("Content Type of %s is %s",p,ContentType);
			}catch(Exception e)
			{e.printStackTrace();}
		}
		public static void main(String...a)
		{
			new ContentTypeOfFile();
		}
}