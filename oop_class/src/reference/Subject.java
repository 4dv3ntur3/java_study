package reference;

public class Subject {
	
	String subjectName;
	int score;
	
	// �л� ������ ������ ���� �̸��� �ٲ�� �� �ƴϹǷ�
	// �̷��� �ϴ� �� �� �ո����̴�.
	public Subject(String name) {
		subjectName = name;
	}
	
	// �̷��� �Ǹ� ������ �ִ� Student class�� �����ؾ� ��
	// setkorea, setmath �� ����! 
	
	
	public void setSubjectName(String name) {
		subjectName = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	// ��Ŭ������ get, set �޼ҵ� ������ ������  
	// ��Ŭ�� -> source -> Generate getter and setter
	// -> ���� ��� ���� ����
	
	
	
	
}
