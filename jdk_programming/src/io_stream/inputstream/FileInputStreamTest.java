package io_stream.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		FileReader fis_ = null;
		try {
			
			// �̷��� �����ϸ� ���⼭ ������ ������ �ؿ� ������ �� ���� 
			//FileInputStream fis = new FileInputStream("input.txt");
			fis = new FileInputStream("input.txt");
			// �ٵ� �̷��� �ѱ��� �� ���� byte ������
			
			fis_ = new FileReader("input.txt");
			
			
			int i = 0;
			// ������ ������ �а� �ʹٸ�
			// �ڵ� �� �� �ߴ� ���򸻿��� return���̳� ���� �� ���� Ȱ��
			while ( (i = fis_.read()) != -1) {
				System.out.print((char)i);
			}
			
			
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			
			// println: line(����) 
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
			
		
		// FileInputStream�� ���� Ŭ������ 
		} catch (IOException e) {
			System.out.println(e);
		} finally {

			 try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace(); // �̷��� �ϸ� ������ �ſ� ��� ���� 
				System.out.println(e);
				
			// Exception e �� �� �ɾ� ������ � �������� �� ���� ����
			// ���ܸ��� �α� ����� ����� �� �ٸ��� ������ 
			// NullPointerException�� runtime exception�̶� �����Ϸ��� �� ����
		
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		// nullpointer exception catch �� �ż� �굵 �� ��µ�
		// input.txt�� �����ϱ� fis�� null, �װ� �������� �ؼ�...
		System.out.println("end");
	}
	
	

}
