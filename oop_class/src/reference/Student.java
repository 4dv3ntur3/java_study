package reference;

public class Student {
	
	
	/*
	 * 개지저분해...
	int studentId;
	String studentName;
	int koreanScore;
	int mathScore; 
	String koreanSubject;
	String mathSubject;
	int englishScore;
	String englishSubject;

	 * 
	 * 
	 */
	
	int studentId;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public Student(int id, String name) {
		
		// 그런데 String도 클래스인데 왜 new를 안 쓸까?
		// jdk에서 제공하는 class 중 new 없이도 쓸 수 있는 게 있음
		// 기본 자료형 쓰듯이... 
		// 우리가 만든 참조자료형은 new로 
		studentId = id;
		studentName = name;
		
		korea = new Subject("국어");
		math = new Subject("수학");
		
		
	}
	
//	public void setKorea(String name, int score) {
//		korea.setSubjectName(name);
//		korea.setScore(score);
//	}
//	
//	public void setMath(String name, int score) {
//		math.setSubjectName(name);
//		math.setScore(score);
//	}
	
	public void setKorea(int score) {
		korea.setScore(score);
	}
	
	public void setMath(int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore()+math.getScore();
		System.out.println(studentName+"학생의 총점: "+total+"점입니다.");
		
	}
	

}
