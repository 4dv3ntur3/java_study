package staticex;

public class StudentTest {

	public static void main(String args[]) {
		Student james = new Student();
		System.out.println(james.studentId);
		
		Student thomas = new Student();
		System.out.println(thomas.studentId);

		// 이렇게 하면 노란 줄 뜸 
//		System.out.println(james.serialNum);
//		System.out.println(thomas.serialNum);
		
		// 이렇게 함 
		// 인스턴스가 없어도 뜸 
		System.out.println(Student.serialNum);
	}

}
