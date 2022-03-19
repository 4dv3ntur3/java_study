package singleton;

public class Company {
	

	// 얘가 유일한 인스턴스가 됨 
	private static Company c_instance = new Company();

	
	// private constructor 생성
	// 외부에서 생성자 호출하지 못하도록 하겠다
	private Company () {}
	
	// 저 인스턴스를 가져다 쓸 수 있도록
	// 그런데 그냥 메서드로 선언하면 인스턴스 생성 없이는 이 메서드를 부를 수가 없다
	// static으로 선언 
	public static Company getInstance() {
		
		// 그럴 일은 없겠지만? 
		if(c_instance == null) {
			c_instance = new Company();
		}
		
		
		return c_instance;
	}


}
