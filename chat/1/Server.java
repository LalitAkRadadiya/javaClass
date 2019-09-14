import java.net.*;
import java.io.*;
import java.util.*;

class Server{
	public static void main(String[] args) {
		try{
			ServerSocket ss=new ServerSocket(5000);
			Socket s = ss.accept();
			while(true)
			{
				DataOutputStream dos= new DataOutputStream(s.getOutputStream());
				Scanner sl=new Scanner(System.in);
				System.out.println("Enter your message : ");
				String s1=sl.nextLine();
				dos.writeUTF(s1);
				DataInputStream dis=new DataInputStream(s.getInputStream());
    			String str=dis.readUTF();
    			System.out.println("Client say:"+str);
			}
			//s.close();
		}catch(IOException e){

		}
	}
}