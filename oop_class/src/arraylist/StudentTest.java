package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student(1001, "Lee");
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 90);
		
		lee.showStudentInfo();
		
		System.out.println("===================");
		Student park = new Student(1002, "Park");
		park.addSubject("국어", 100);
		park.addSubject("수학", 50);
		park.addSubject("영어", 80);
		
		park.showStudentInfo();
		


	}

}
