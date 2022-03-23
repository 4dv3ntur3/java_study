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
			
			// 이렇게 선언하면 여기서 선언한 변수라서 밑에 블럭에서 안 보임 
			//FileInputStream fis = new FileInputStream("input.txt");
			fis = new FileInputStream("input.txt");
			// 근데 이러면 한글은 다 깨짐 byte 단위라서
			
			fis_ = new FileReader("input.txt");
			
			
			int i = 0;
			// 파일을 끝까지 읽고 싶다면
			// 코드 쓸 때 뜨는 도움말에서 return값이나 설명 잘 보고 활용
			while ( (i = fis_.read()) != -1) {
				System.out.print((char)i);
			}
			
			
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			
			// println: line(개행) 
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
//			System.out.print((char)fis.read());
			
		
		// FileInputStream의 상위 클래스임 
		} catch (IOException e) {
			System.out.println(e);
		} finally {

			 try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace(); // 이렇게 하면 내용이 매우 길게 나옴 
				System.out.println(e);
				
			// Exception e 로 다 걸어 버리면 어떤 예외인지 알 수가 없음
			// 예외마다 로그 남기는 방식이 다 다르기 때문에 
			// NullPointerException은 runtime exception이라서 컴파일러가 못 잡음
		
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		// nullpointer exception catch 안 돼서 얘도 안 출력됨
		// input.txt가 없으니까 fis가 null, 그걸 닫으려고 해서...
		System.out.println("end");
	}
	
	

}
