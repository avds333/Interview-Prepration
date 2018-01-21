import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Client
{
	Socket s;
	DataInputStream din;
	DataOutputStream dout;
	Client()
	{
			try{
				//s=new Socket("192.168.43.180");
				s=new Socket("localhost",10);
				System.out.println(s);
				din=new DataInputStream(s.getInputStream());
				dout=new DataOutputStream(s.getOutputStream());
				clientChat();
			}catch(Exception e)
			{e.printStackTrace();}
	}
	public void clientChat() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1;
		do{
			s1=br.readLine();
			dout.writeUTF(s1);
			dout.flush();
			System.out.println("Server Message : "+din.readUTF());
		}while(!s1.equals("stop"));
	}
	public static void main(String...a)
	{
		new Client();
	}
}