package oop_class;

// main 함수 쓰는 법 2번째 (다른 클래스 파일에서)
// 이 class의 이름은 oop_class.StudentClass임

public class StudentTest {
	
	 public static void main(String[] args) { 
		 Student Lee = new Student(); 
		 
		 // 생성자 만들면 여기 빨간줄 뜸. 기본 생성자 제공 안 해 줘서. 
		 // 1. 그냥 만든 생성자로 사용하거나 
		 // 2. 기본 생성자 클래스 코드에 추가해 주기 
		 
		 Lee.studentName = "박은지"; 
		 Lee.studentID = 1234567; 
		 Lee.address = "서대문구 거북골로"; 
		 
		 Lee.showStudentInfo(); 
		 
		 System.out.println(Lee); 
		 // 이 Lee는 참조변수.
		 // oop_class.Student@32d2fa64
		 // 앞은 패키지.클래스이름@16진수로 표현된 힙메모리 주소값. 참조값.
	 }
	
}


/*
 * C언어 계열 같은 경우는 명명규칙이 있다.
 * 멤버변수는 m으로 시작하고, 정수는 i, global 변수는 g로 시작...
 * java는 없고
 * 패키지 이름은 소문자,
 * class 이름은 대문자(단어 바뀔 때도)
 * 변수, 함수 이름도 소문자로 시작, 단어 바뀔 때 대문자 (camel notation)
 *
 * 패키지: 소스의 묶음. 패키지 이름 = 성격
 * 소스를 어떤 계층 구조로 관리할지. 
 * 패키지 구조를 어떻게 잡느냐에 따라 소스 관리가 달라짐.
 * class를 구별하게 됨 package이름.class이름
 * 
 * 
 * 
 * 
 * 
 */
