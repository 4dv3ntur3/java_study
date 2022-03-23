package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		// filenotfound, classnotfound 핸들링해야 됨
		// 1. 여기 안에서 try catch
		// 2. 둘 다 throws
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className); // Class class (기본 클래스)
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이 메서드를 쓰겠다고 하면 저 위에서 throw를 했기 때문에
		// 이 class를 사용하는 쪽에서 핸들링해야 함
		ThrowsException ex = new ThrowsException();
		try {
			ex.loadClass("b.txt", "java.lang.string"); // java.lang.String임
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
			// 무슨 예외가 발생할지 모르겠다면 맨 밑의 catch에 Exception(최상위 클래스)
			// 단, 이건 위로 올리면 안 됨. 왜냐하면 모든 exception이 다 여기서 걸리기 때문에 
			// 나머지 블락에 들어갈 일이 없다.
			// 맨 마지막에 써야 함 
			// throw는 예외 발생, throws는 예외 미루기 
		}
	
		System.out.println("end");

		
		

	}

}
