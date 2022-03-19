package arraylist;

import java.util.ArrayList;

public class Student {
	
	private int studentID;
	private String studentName;
	
	// 수강할 과목들의 배열 
	private ArrayList<Subject> subjectList;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	// 과목을 수강하게 되면 subjectList에 추가되어야 함
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		for(Subject subject: subjectList) {
			total += subject.getScorePoint();
			System.out.println("학생" + studentName + "님의" 
		+ subject.getName() + "과목의 점수는 " + subject.getScorePoint() + "입니다.");
		}
		
		System.out.println("총점: "+total);
		
	}

	
}
