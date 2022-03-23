package io_stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int i = 0;
		System.out.println("알파벳 하나를 쓰고 엔터를 누르세요");
		try {
			i = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 하나는 한바이트, 멀티바이트(array단위로), 특정 length만큼만 읽어오는 
		System.out.println(i); // 아스키코드
		System.out.println((char)i);
		*/
		
		int i = 0;
		// 여러 문자 받기 
		System.out.println("알파벳 하나를 쓰고 엔터를 누르세요");
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
