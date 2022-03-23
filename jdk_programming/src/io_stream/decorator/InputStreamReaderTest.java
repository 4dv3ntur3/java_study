package io_stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ �ȿ� ��� ��Ʈ��
		// ���� �� ���ڷ� ��ȯ�� �ִ� �� 
		// �̷� �� ���� ��Ʈ�� (�ȿ� �ٸ� ��Ʈ���� ������) : ��� ��Ʈ���� ����, ���� ��Ʈ���� ���� 
		try(InputStreamReader fis = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i = 0;
			while ((i=fis.read()) != -1) {
				System.out.print((char)i);
				// FileInputStream ���� �ѱ� �� ����
				// Reader�� ������ �� 
			}
		} catch (IOException e) {
			System.out.println(e);
			
		}
		
		Socket socket = new Socket();
		try {
			// �����ڰ� �ִµ� ȥ�� �������� �ʰ� ���� �� inpustream�� �޴´�
			// �ٸ� stream�� �޾Ƽ� �� stream�� byte�� ���� �� chracter set�� �°� ��� ��ȯ 
			// bufferedReader�� ���� �� �ִ� bufferedLine: �� �� ���� �� �ִ� ��� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())
			br.readLine();
			// ���� ��Ʈ�� �ȿ� �Ǵٸ� ������Ʈ��
			
			InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
