package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		// filenotfound, classnotfound �ڵ鸵�ؾ� ��
		// 1. ���� �ȿ��� try catch
		// 2. �� �� throws
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className); // Class class (�⺻ Ŭ����)
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �� �޼��带 ���ڴٰ� �ϸ� �� ������ throw�� �߱� ������
		// �� class�� ����ϴ� �ʿ��� �ڵ鸵�ؾ� ��
		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.string"); // java.lang.String��
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
			// ���� ���ܰ� �߻����� �𸣰ڴٸ� �� ���� catch�� Exception(�ֻ��� Ŭ����)
			// ��, �̰� ���� �ø��� �� ��. �ֳ��ϸ� ��� exception�� �� ���⼭ �ɸ��� ������ 
			// ������ ����� �� ���� ����.
			// �� �������� ��� �� 
			// throw�� ���� �߻�, throws�� ���� �̷�� 
		}
	
		System.out.println("end");

		
		

	}

}
