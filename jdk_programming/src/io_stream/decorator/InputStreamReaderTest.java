package io_stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생성자 안에 기반 스트림
		// 읽을 때 문자로 변환해 주는 것 
		// 이런 게 보조 스트림 (안에 다른 스트림을 포함함) : 기반 스트림일 수도, 보조 스트림일 수도 
		try(InputStreamReader fis = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i = 0;
			while ((i=fis.read()) != -1) {
				System.out.print((char)i);
				// FileInputStream 쓰면 한글 다 깨짐
				// Reader로 읽으면 됨 
			}
		} catch (IOException e) {
			System.out.println(e);
			
		}
		
		Socket socket = new Socket();
		try {
			// 생성자가 있는데 혼자 생성되지 않고 전부 다 inpustream을 받는다
			// 다른 stream을 받아서 이 stream을 byte로 읽은 걸 chracter set에 맞게 묶어서 변환 
			// bufferedReader로 감쌀 수 있다 bufferedLine: 한 줄 읽을 수 있는 기능 있음
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())
			br.readLine();
			// 보조 스트림 안에 또다른 보조스트림
			
			InputStreamReader ir = new InputStreamReader(socket.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
