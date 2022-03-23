package io_stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	
	public static void main(String args[]) {
		
		// buffer
		byte[] bs = new byte[26];
		byte data = 65;
		for (int i=0; i<bs.length; i++) {
			bs[i] = data++;
		}
		
		try (FileOutputStream fos = new FileOutputStream("output.txt")) {
			// fos.write(bs);
			fos.write(bs, 2, 10); // c���� 10�� 
			// bs index 0, 1, 2���� 10�� 
			// �ٵ� abc�� ��µǳ�?
			// fileoutputstream�� ���ڿ� �����Ǵ� �ƽ�Ű�ڵ尪�� ���ڷ� ����ش�
			// �״�� ���� ������ �ٸ��� ��ߵ� 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		// true option �ָ� output.txt ���Ͽ� �̾�� �ǰ� 
		// default�� false�� �׳� ��� overwrite��
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			fos.write(65); // write�� int�� ���� �Ǿ� �ִ�
			fos.write(66); // write�� int�� ���� �Ǿ� �ִ�
			fos.write(67); // write�� int�� ���� �Ǿ� �ִ�
			
			// �ٵ� abc�� ��µǳ�?
			// fileoutputstream�� ���ڿ� �����Ǵ� �ƽ�Ű�ڵ尪�� ���ڷ� ����ش�
			// �״�� ���� ������ �ٸ��� ��ߵ� 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}
