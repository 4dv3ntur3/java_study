package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student(1001, "Lee");
		lee.addSubject("����", 100);
		lee.addSubject("����", 90);
		
		lee.showStudentInfo();
		
		System.out.println("===================");
		Student park = new Student(1002, "Park");
		park.addSubject("����", 100);
		park.addSubject("����", 50);
		park.addSubject("����", 80);
		
		park.showStudentInfo();
		


	}

}
