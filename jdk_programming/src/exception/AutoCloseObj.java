package exception;

public class AutoCloseObj implements AutoCloseable {

	// 닫힐 때 이게 불린다는 뜻 
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("close()");
		
	}
	
	

}
