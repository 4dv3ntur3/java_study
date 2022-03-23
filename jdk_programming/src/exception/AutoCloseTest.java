package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// java 9 이후는 AutoCloseObj 밖에서 선언하고 
		// try(obj) 이런 식으로 해도 오류 안 남
		// 그전에는 참조변수만은 못 하고 선언문을 다 써줘야 함 
		
		
		// 정상적으로 수행되면 그냥 close가 불린다 
		// Autocloseable이 구현된 클래스는 finally를 안 해 줘도 된다
		try(AutoCloseObj obj = new AutoCloseObj()) {
			// 강제로 exception 이슈시켜서
			throw new Exception(); // 이렇게 하면 close 되고 나서 예외 발생함
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
