package reference;

public class Student {
	
	
	/*
	 * ����������...
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
		korea = new Subject("����");
		math = new Subject("����");
	}
	
	public Student(int id, String name) {
		
		// �׷��� String�� Ŭ�����ε� �� new�� �� ����?
		// jdk���� �����ϴ� class �� new ���̵� �� �� �ִ� �� ����
		// �⺻ �ڷ��� ������... 
		// �츮�� ���� �����ڷ����� new�� 
		studentId = id;
		studentName = name;
		
		korea = new Subject("����");
		math = new Subject("����");
		
		
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
		System.out.println(studentName+"�л��� ����: "+total+"���Դϴ�.");
		
	}
	

}
