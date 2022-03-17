package reference;

public class Subject {
	
	String subjectName;
	int score;
	
	// 학생 생성할 때마다 과목 이름이 바뀌는 게 아니므로
	// 이렇게 하는 게 더 합리적이다.
	public Subject(String name) {
		subjectName = name;
	}
	
	// 이렇게 되면 기존에 있던 Student class도 수정해야 함
	// setkorea, setmath 다 변경! 
	
	
	public void setSubjectName(String name) {
		subjectName = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	// 이클립스가 get, set 메소드 위저드 제공함  
	// 우클릭 -> source -> Generate getter and setter
	// -> 만들 멤버 변수 선택
	
	
	
	
}
