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
			// 근데 진심 개ㅐㅐㅐㅐ오래 걸림...
			// buffering 쓰겠다
			// 보조 스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos))

		{
			// a.exe 그냥 이클립스 설치파일 이름만 바꿔둔 것
			// 그런데? b.exe 보면 걔로도 이클립스 설치 잘만된다
			millisec = System.currentTimeMillis();
			int i ;
			while((i=fis.read()) != -1) {
				fos.write(i); // a 내용을 b에 씀 (복사)
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
