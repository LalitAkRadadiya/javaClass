import java.net.*;
import java.io.*;
import java.util.*;
public class Client{
	public static void main(String[] args) {
		try{
			Socket socket=new Socket("localhost",5000);
  	 		System.out.println("client has been started");
    		System.out.println("waiting for server");
			while(true){
    			DataInputStream dis=new DataInputStream(socket.getInputStream());
    			DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
    			String s=dis.readUTF();
    			System.out.println("Server Says : " + s);
    			System.out.println("Enter your message : ");
    			Scanner sl=new Scanner(System.in);
    			String mes=sl.nextLine();
    			dos.writeUTF(mes);
			}
			//Socket.close();
    	}catch(IOException e){

    	}	
	}
}