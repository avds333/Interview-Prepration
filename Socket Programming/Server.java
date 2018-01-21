import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
public class Server
{
	ServerSocket ss;
	Socket s;
	DataInputStream dis;
	DataOutputStream dout;
	Server()
	{
		try{
			System.out.println("Server Started");
			ss=new ServerSocket(10);
			s=ss.accept();
			System.out.println("Client Connected.");
			dis=new DataInputStream(s.getInputStream());
			dout=new DataOutputStream(s.getOutputStream());
			serverChat();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    void serverChat() throws IOException
	{
		String str;
		do{
			str=dis.readUTF();
			System.out.println("Client Message: "+str);
			dout.writeUTF("Hello");
			dout.flush();
		}while(!str.equals("stop"));
	}
	public static void main(String...a)
	{
		new Server();
	}
}