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
			System.out.println("Ŭ���̾�Ʈ ���� �غ� �Ϸ�");
			
			socket = serverSocket.accept();
			
			System.out.println("Ŭ���̾�Ʈ ����");
			System.out.println("Socket: " + socket);
			
			// �޴� �� ���� 
			inputstream = socket.getInputStream();
			datainputstream = new DataInputStream(inputstream);
			
			outputstream = socket.getOutputStream();
			dataoutputstream = new DataOutputStream(outputstream);	
			
			while(true) {
				String clientMessage = datainputstream.readUTF();
				
				System.out.println("client message: "+clientMessage);
				
				dataoutputstream.writeUTF("���� �Ϸ�~");
				dataoutputstream.flush();
				
				if(clientMessage.equals("STOP")) break;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally { // �ݵ�� �ڿ� ���� 
			
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
