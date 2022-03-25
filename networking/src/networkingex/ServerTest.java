package networkingex;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			// localhost=local IP, port번호
			serverSocket = new ServerSocket(9000);
			System.out.println("클라이언트 맞을 준비 완료!");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트 접속");
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			
			try {
				
				if(socket != null) {
					socket.close();
				}
				
				if(serverSocket != null) {
					serverSocket.close();
				}
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		

	}

}
