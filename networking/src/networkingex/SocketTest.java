package networkingex;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 서버 소켓 만들기
		ServerSocket serverSocket = null;
		
		// 클라이언트 소켓 
		Socket socket = null;
		
		try {
			// 9000: 포트번호 (외부에서 접속 시 각각 포트번호 지정. 9000번은 어떤 서비스를 이용하세요~
			serverSocket = new ServerSocket(9000);
			System.out.println("클라이언트 맞을 준비 완료!");
			
			// 클라이언트 접속 (localhost:9000에 접속하게 되면 실행)
			// 즉 client가 요청했을 때 accept() 메서드 자동 실행 -> Server 측에서 socket을 반환함 
			socket = serverSocket.accept();
			System.out.println("연결 완료!");
			System.out.println("socket: " + socket);
			
		} catch (Exception e) {
			System.out.println(e);
		
			
		} finally {
			// 자원 해제 반드시
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
