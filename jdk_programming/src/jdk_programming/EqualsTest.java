package jdk_programming;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if (obj instanceof Student) {
			Student std = (Student)obj;
			
			// 학번 기준으로 체크하도록 재정의
			// 학번이 같으면 동일하다고 하도록 재정의
			if(studentID == std.studentID) return true;
			else return false;
		}
		
		return false;
		
		
//		return super.equals(obj);
	}
	
	// 따라서 두 학생의 학번이 같다면 같은 학생이므로 그냥 학번을 return하도록 재정의
	public int hashCode() {
		return studentID;
	}
	
	// 만약에 equals만 정의하고 hashcode를 정의 안 하면 hashset 같은 클래스 사용할 때 
	// 안 돌아갈 수도 있음
	// java 내에서는 equlas가 재정의가 되어 있을 때 두 개가 true면 hashcode값도 같아야 함 
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("test1");
		String str2 = new String("test1");

		System.out.println(str1==str2); // false
		
		// String class에서 equals 재정의 해 놨음
		// 두 문자열 내용이 같으면 true로 반환함 (논리적 동일성) 
		System.out.println(str1.equals(str2)); // true
		
		Student std1 = new Student(10001, "Thomas");
		Student std2 = new Student(10001, "Thomas");
		
		System.out.println(std1==std2); // false
		System.out.println(std1.equals(std2)); // true
		
		// 10진수로 반환 (여태 주소값은 16진수)
		System.out.println(std1.hashCode()); 
		System.out.println(std2.hashCode());
		
		// 이 경우는 값이 같다
		// 왜냐하면 String class에서 hashcode를 재정의해 뒀기 때문 
		// 논리적으로 동일한 인스턴스는 동일한 해시코드를 반환하는 게 맞다
		System.out.println(str1.hashCode()); 
		System.out.println(str2.hashCode());
		
		// 재정의 전 진짜 해쉬코드값
		// String hashcode: string을 가지고 해시코드 짜는 알고리즘으로 구현
		// Integer는 정수값으로 
		System.out.println(System.identityHashCode(str1)); 
		System.out.println(System.identityHashCode(str2)); 
		
		
		
		
	}

}
