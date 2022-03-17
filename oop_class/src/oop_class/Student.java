package oop_class;

public class Student {

	// class는 대문자로 시작
	// 패키지는 소문자
	// 하나의 java 밑에는 하나의 클래스가 원칙
	// 여러 개의 class일 경우: public class는 하나이고,
	// 이 public class와 java 파일 이름은 동일해야 함
	
	// java의 모든 코드는 class 내부에 위치 
	// 바깥에는 뭐 import 정도...? 
	
	int studentID; // 멤버 변수는 파란색으로
	String studentName; // 자바의 문자열 클래스 String
	int grade;
	String address;
	
	// 생성자
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	// 생성자 오버로딩. 이름은 동일하지만 매개변수가 다름 

	public Student() {}
	
	// 메서드
	// 만든 클래스를 어떻게 쓸까? 
	// 다른 클래스에서 사용. 
	// 웹 서비스: 서버에 요청이 들어가면 거기서 필요한 클래스들 쪽으로 
	// 요청에 대한 처리를 하기 위해 클래스 생성, 메소드 호출 
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	
	// 클래스를 사용하는 쪽 관점에서 메서드 이름 작성
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// entry point (클래스 호출(사용))을 위한 main code
	
	// 방법 1. 클래스 안에서 main 
	/*
	 * public static void main(String[] args) { Student Lee = new Student();
	 * Lee.studentName = "박은지"; Lee.studentID = 1234567; Lee.address = "서대문구 거북골로";
	 * 
	 * Lee.showStudentInfo(); }
	 */
	
	// class 안에서 쓰지만 jvm이 main함수를 호출해서 얘가 먼저 수행됨
	// 클래스 내부에 있지만 멤버함수 아니다
	// 항상 있어야 하는 건 아님. 객체 사용을 위한 함수일 뿐. 
	public static void main(String[] args) {
		
		int i = 10; // 기본 자료형
		
		
		// 이런 클래스 이름은 참조형 데이터 타입 , Park은 참조 변수 
		Student Park = new Student(); // 기본 생성자 
		// Park이라는 객체가 heap에 생성
		// 클래스이름에 점 찍었을 때 뜨는 다른 함수들은 object class의 함수다
		// 공용 함수임
		Park.studentName = "이순신";
		Park.studentID = 100;
		Park.address = "서울시 마포구";
		
		Student Kim = new Student();
		Kim.studentName = "유관순";
		Kim.studentID = 200;
		Kim.address = "서울시 종로구";
		
		Park.showStudentInfo();
		Kim.showStudentInfo();
		
		
	}
	
}
