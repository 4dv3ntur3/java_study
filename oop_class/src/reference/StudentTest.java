package reference;

public class StudentTest {

	public static void main(String args[]) {
		Student James = new Student(100, "James");
//		James.setKorea("����",100);
//		James.setMath("����", 100);
		
		James.setKorea(100);
		James.setMath(100);
		
		Student Kim = new Student(101, "Kim");
//		Kim.setKorea("����",55);
//		Kim.setMath("����", 45);
		
		Kim.setKorea(55);
		Kim.setMath(45);
		
		James.showStudentInfo();
		Kim.showStudentInfo();
	}
}
