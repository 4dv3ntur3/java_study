package io_stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int i = 0;
		System.out.println("���ĺ� �ϳ��� ���� ���͸� ��������");
		try {
			i = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// �ϳ��� �ѹ���Ʈ, ��Ƽ����Ʈ(array������), Ư�� length��ŭ�� �о���� 
		System.out.println(i); // �ƽ�Ű�ڵ�
		System.out.println((char)i);
		*/
		
		int i = 0;
		// ���� ���� �ޱ� 
		System.out.println("���ĺ� �ϳ��� ���� ���͸� ��������");
		try {
			while((i=System.in.read()) != '\n') {
				System.out.println((char)i);
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	
	
}
