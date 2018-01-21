import java.io.FileReader;
import java.io.BufferedReader;
class B_ReadingFile_BufferedReader
{
   public static void main(String...a)
   {
     
	 try
	 {
		 String my="";
		 FileReader fr=new FileReader("Resume_Corrections.txt");
         BufferedReader br=new BufferedReader(fr);
		 while((my=br.readLine())!=null)
		 {
			 System.out.println();
		 }
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
   }
}