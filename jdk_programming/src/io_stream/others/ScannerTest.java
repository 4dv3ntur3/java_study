package io_stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// �� ���� �д´�, ������ boolean�� �д´�
		// �и����ͷ� ���� ���� ���� (seperator?)
		String name = scanner.nextLine();
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(num);

	}

}
