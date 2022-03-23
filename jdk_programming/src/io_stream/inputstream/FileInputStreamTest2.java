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
				// 6 하고 나머지 4개는 garbage (buffer 통째로 출력해서 이렇게 됨)
				System.out.println();
			}
			*/
			
			while((i=fis.read(bs)) != -1) {
				for (int j =0; j<i; j++) {
					System.out.print((char)bs[j]); // 읽은 개수만큼만 
				}
				
				// 전체를 다 출력하면 
				// 10
				// 10
				// 6 하고 나머지 4개는 garbage(이전입력에서 남아있던 것들)
				// (buffer 통째로 출력해서 이렇게 됨)
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println(e);
			// autocloseable 구현해서 close 안 해 줘도 됨
		}
	}

}
