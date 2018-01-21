import java.io.BufferedReader;
import java.io.InputStreamReader;
class OptimizeOutput
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   OptimizeOutput()
   {
     try{
          int L=Integer.parseInt(br.readLine());
	  int N=Integer.parseInt(br.readLine());
 	  for(int i=0;i<N;i++)
	  {
		int j=s.indexOf(" ");
		System.out.println("J = "+j);
		char w[]=new char[j];
		s.getChars(0,j,w,0);
		
		char h[]=new char[s.length()-j-1];
		s.getChars(j+1,s.length,h,0);
		String s1=new String(w);
		String s2=new String(h)		
		
	  }
	}catch(Exception e)
	{
	   
	}
   }
   public static void main(String...a)
   {
	new OptimizeOutput();
   }
}