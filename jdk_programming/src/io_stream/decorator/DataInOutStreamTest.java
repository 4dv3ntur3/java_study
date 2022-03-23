package io_stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자가 문자로 바뀌어서 작성되는 게 있었음
		// 그대로 자료형 보존되는 것
		
		try (FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.write(100);
			dos.writeInt(10);
			dos.writeChar('A');
			dos.writeUTF("hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e);
		}
		
		try (FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)) {
			
		// 자료형에 맞게 데이터 저장
		// WriteInt 쓰고 그냥 read 쓰면 이상하게 읽어와짐 
		System.out.println(dis.read());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readUTF());

		} catch (IOException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
			System.out.println(e);
		}

	}
}
