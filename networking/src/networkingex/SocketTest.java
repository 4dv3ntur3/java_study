package networkingex;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ���� �����
		ServerSocket serverSocket = null;
		
		// Ŭ���̾�Ʈ ���� 
		Socket socket = null;
		
		try {
			// 9000: ��Ʈ��ȣ (�ܺο��� ���� �� ���� ��Ʈ��ȣ ����. 9000���� � ���񽺸� �̿��ϼ���~
			serverSocket = new ServerSocket(9000);
			System.out.println("Ŭ���̾�Ʈ ���� �غ� �Ϸ�!");
			
			// Ŭ���̾�Ʈ ���� (localhost:9000�� �����ϰ� �Ǹ� ����)
			// �� client�� ��û���� �� accept() �޼��� �ڵ� ���� -> Server ������ socket�� ��ȯ�� 
			socket = serverSocket.accept();
			System.out.println("���� �Ϸ�!");
			System.out.println("socket: " + socket);
			
		} catch (Exception e) {
			System.out.println(e);
		
			
		} finally {
			// �ڿ� ���� �ݵ��
			try { 
				if(socket != null) {
					socket.close();
				}
				
				if(serverSocket != null) {
					serverSocket.close();
				}
				
			} catch (Exception e){
				System.out.println(e);
				
			}
		}

	}

}
