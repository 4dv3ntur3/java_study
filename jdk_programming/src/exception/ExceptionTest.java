package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) { // throws FileNotFoundException 
 		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		
		// �� ���Ͽ��� �о�鿩��
		// �ٵ� �� ������ ������ ��¿ �ų� �ڵ鸵�ض� ��� ������ �� 
		try {
			// FileInputStream f1 �ϸ� autocloseable ���� ����
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
//			e.printStackTrace();
			return;
		} finally { // ����� �׻� ����� 
			try {
				fis.close(); // ���� ���� �������� �� ���� �ְ�... ���� �߻� ���ɼ� O 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			System.out.println("finally");
		}
		// throw�ϰ� �Ǹ�(�о������) exception�� jvm ������ �Ѿ�� ���α׷��� ���� 
		
		
		// autocloseable ���ҽ�
		// try �ȿ� �̷��� ������ �� 
		try (FileInputStream fis2 = new FileInputStream("a.txt")) {
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		System.out.println("end");
		
	}

}
