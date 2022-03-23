package io_stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long millisec = 0;
		int len = 0;
		
		try (FileInputStream fis = new FileInputStream("a.exe");
			FileOutputStream fos = new FileOutputStream("b.exe");
			// �ٵ� ���� �������������� �ɸ�...
			// buffering ���ڴ�
			// ���� ��Ʈ��
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos))

		{
			// a.exe �׳� ��Ŭ���� ��ġ���� �̸��� �ٲ�� ��
			// �׷���? b.exe ���� �·ε� ��Ŭ���� ��ġ �߸��ȴ�
			millisec = System.currentTimeMillis();
			int i ;
			while((i=fis.read()) != -1) {
				fos.write(i); // a ������ b�� �� (����)
				len++;
			}
			
			millisec = System.currentTimeMillis() - millisec;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e);
		}
				

	}

}
