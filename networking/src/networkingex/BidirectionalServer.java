package networkingex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BidirectionalServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		InputStream inputstream = null;
		DataInputStream datainputstream = null;
		
		OutputStream outputstream = null;
		DataOutputStream dataoutputstream = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("클라이언트 맞을 준비 완료");
			
			socket = serverSocket.accept();
			
			System.out.println("클라이언트 접속");
			System.out.println("Socket: " + socket);
			
			// 받는 것 먼저 
			inputstream = socket.getInputStream();
			datainputstream = new DataInputStream(inputstream);
			
			outputstream = socket.getOutputStream();
			dataoutputstream = new DataOutputStream(outputstream);	
			
			while(true) {
				String clientMessage = datainputstream.readUTF();
				
				System.out.println("client message: "+clientMessage);
				
				dataoutputstream.writeUTF("전송 완료~");
				dataoutputstream.flush();
				
				if(clientMessage.equals("STOP")) break;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally { // 반드시 자원 해제 
			
			try {
				if(serverSocket != null) {
					serverSocket.close();
				}
				
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			

		}
	
	}

}
