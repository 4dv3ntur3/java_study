package io_stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// c언어와 매우 유사 
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100); // 4 (int: 4바이트)
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14); // +8 (double: 8바이트)
		System.out.println(rf.getFilePointer());
		
		// 한글 1개당 3바이트 즉 +3*5+null character 2바이트 = 17
		rf.writeUTF("안녕하세요"); // 17
		System.out.println(rf.getFilePointer());
		
		// 현재 파일포인터가 29 위치에 있음
		// 읽으려면 다시 처음으로 
		rf.seek(0);
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		
		

	}

}
