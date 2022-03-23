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
			fos.write(bs, 2, 10); // c부터 10개 
			// bs index 0, 1, 2부터 10개 
			// 근데 abc가 출력되네?
			// fileoutputstream은 숫자에 대응되는 아스키코드값을 문자로 찍어준다
			// 그대로 쓰고 싶으면 다른거 써야됨 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		// true option 주면 output.txt 파일에 이어쓰게 되고 
		// default는 false라서 그냥 계속 overwrite됨
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			fos.write(65); // write는 int를 쓰게 되어 있다
			fos.write(66); // write는 int를 쓰게 되어 있다
			fos.write(67); // write는 int를 쓰게 되어 있다
			
			// 근데 abc가 출력되네?
			// fileoutputstream은 숫자에 대응되는 아스키코드값을 문자로 찍어준다
			// 그대로 쓰고 싶으면 다른거 써야됨 
			
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
