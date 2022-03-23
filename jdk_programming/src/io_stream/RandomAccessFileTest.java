package io_stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// c���� �ſ� ���� 
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100); // 4 (int: 4����Ʈ)
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14); // +8 (double: 8����Ʈ)
		System.out.println(rf.getFilePointer());
		
		// �ѱ� 1���� 3����Ʈ �� +3*5+null character 2����Ʈ = 17
		rf.writeUTF("�ȳ��ϼ���"); // 17
		System.out.println(rf.getFilePointer());
		
		// ���� ���������Ͱ� 29 ��ġ�� ����
		// �������� �ٽ� ó������ 
		rf.seek(0);
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		
		

	}

}
