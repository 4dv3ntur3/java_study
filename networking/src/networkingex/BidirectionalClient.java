package networkingex;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class BidirectionalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		
		OutputStream outputstream = null;
		DataOutputStream dataoutputstream = null;
		
		InputStream inputstream = null;
		DataInputStream datainputstream = null;
		
		Scanner scanner = null;
		
		try {
			socket = new Socket("localhost", 9000);
			System.out.println("Socket: "+ socket);
			
			// 보내는 것 먼저 
			outputstream = socket.getOutputStream();
			dataoutputstream = new DataOutputStream(outputstream);

			inputstream = socket.getInputStream();
			datainputstream = new DataInputStream(inputstream);
			
			scanner = new Scanner(System.in);
			
			while(true) {
				System.out.println("메시지 입력");
				String outMessage = scanner.nextLine();
				
				dataoutputstream.writeUTF(outMessage);
				dataoutputstream.flush();
				
				String inMessage = datainputstream.readUTF();
				System.out.println("in Message: " + inMessage);
				
				// stop 입력시 kill
				if(outMessage.equals("STOP")) break;

			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			
			try {
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		
		

	}

}
