package staticex;

public class StudentTest {

	public static void main(String args[]) {
		Student james = new Student();
		System.out.println(james.studentId);
		
		Student thomas = new Student();
		System.out.println(thomas.studentId);

		// �̷��� �ϸ� ��� �� �� 
//		System.out.println(james.serialNum);
//		System.out.println(thomas.serialNum);
		
		// �̷��� �� 
		// �ν��Ͻ��� ��� �� 
		System.out.println(Student.serialNum);
	}

}
