package networkingex;

import java.net.Socket;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		
		try {
			// localhost=local IP, port번호
			socket = new Socket("localhost", 9000);
			System.out.println("서버 연결");
			System.out.println("Socket:" + socket);
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (socket!=null) {
				try {
					socket.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
