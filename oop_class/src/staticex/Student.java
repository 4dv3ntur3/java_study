package staticex;

public class Student {
	
	// 이 값을 private static int로 선언해도 됨 (밖에서 마구 접근해서 증가시키면 안 됨. 인스턴스 생길 떄마다 증가하는 중요한 값임) 
	// setter, getter 생성해 주면 됨 필요시에 따라 setter 없어도 ok
	// public static int getSerialNum()
	public static int serialNum = 10000;
	int studentId;
	String studentName;
	
	// 학생이 생성될 떄 저 serialNum을 증가
	public Student() {
		serialNum++;
		this.studentId = serialNum;
	}
	
	/*
	 * 	// public static int getSerialNum() {
	 * 		int i = 10; // 지역변수 
	 * 		i++;
	 * 		System.out.println(i);
	 * 		
	 * 		studentName = "홍길동"; // 이건 안 됨!!! 멤버 변수=인스턴스 변수이기 때문에
	 * 		// 인스턴스 변수는 인스턴스가 new 될 때 생성됨. 그런데 static은 new 없어도 쓸 수 있음.
	 *		// 그래서 이렇게 쓰면 생기지도 않은 인스턴스 변수에 홍길동을 넣게 되는 것임
	 *		// 스태틱 메서드에서는 인스턴스 변수를 사용할 수 없다 
	 * 							
	 * 		return serialNum; // static 변수. 클래스 변수
	 * }
	 * 
	 * 
	 */

	
	
}
