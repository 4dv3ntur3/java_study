package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) { // throws FileNotFoundException 
 		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		
		// 이 파일에서 읽어들여라
		// 근데 이 파일이 없으면 어쩔 거냐 핸들링해라 라고 빨간줄 뜸 
		try {
			// FileInputStream f1 하면 autocloseable 구현 보임
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
//			e.printStackTrace();
			return;
		} finally { // 여기는 항상 수행됨 
			try {
				fis.close(); // 없는 파일 닫으려고 할 수도 있고... 예외 발생 가능성 O 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			System.out.println("finally");
		}
		// throw하게 되면(밀어버리면) exception이 jvm 쪽으로 넘어가서 프로그램이 죽음 
		
		
		// autocloseable 리소스
		// try 안에 이렇게 넣으면 됨 
		try (FileInputStream fis2 = new FileInputStream("a.txt")) {
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		System.out.println("end");
		
	}

}
