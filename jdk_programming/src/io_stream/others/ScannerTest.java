package io_stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// 한 줄을 읽는다, 정수나 boolean을 읽는다
		// 분리미터로 읽을 수도 있음 (seperator?)
		String name = scanner.nextLine();
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(num);

	}

}
