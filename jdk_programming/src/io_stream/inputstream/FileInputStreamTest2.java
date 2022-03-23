package io_stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			
			int i;
			/*
			while((i=fis.read(bs)) != -1) {
				for (byte b: bs) {
					System.out.print((char)b);
				}
				// 10
				// 10
				// 6 �ϰ� ������ 4���� garbage (buffer ��°�� ����ؼ� �̷��� ��)
				System.out.println();
			}
			*/
			
			while((i=fis.read(bs)) != -1) {
				for (int j =0; j<i; j++) {
					System.out.print((char)bs[j]); // ���� ������ŭ�� 
				}
				
				// ��ü�� �� ����ϸ� 
				// 10
				// 10
				// 6 �ϰ� ������ 4���� garbage(�����Է¿��� �����ִ� �͵�)
				// (buffer ��°�� ����ؼ� �̷��� ��)
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println(e);
			// autocloseable �����ؼ� close �� �� �൵ ��
		}
	}

}
