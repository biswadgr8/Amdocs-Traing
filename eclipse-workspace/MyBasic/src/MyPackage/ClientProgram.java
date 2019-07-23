package MyPackage;
import java.net.*;
import java.io.*;
public class ClientProgram {
	
	public static void main(String[] args) throws Exception
	{
		try
		{
			Socket socket = new Socket("127.0.0.1",00);
			DataInputStream inStream = new DataInputStream(socket.getInputStream());
			DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
			BufferedReader Myinput = new BufferedReader(new InputStreamReader(System.in));
			String clientMessage="",serverMessage="";
			while(!clientMessage.equals("bye"))
			{
				System.out.println("Enter Number");
				clientMessage = Myinput.readLine();
				outStream.writeUTF(clientMessage);
				outStream.flush();
				serverMessage = inStream.readUTF();
				System.out.println(serverMessage);
			}
			outStream.close();
			outStream.close();
			socket.close();
		}
		catch(Exception e)
		{
			
		}
	}
}
