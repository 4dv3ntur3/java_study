package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// ��ü�� ���� �κ�
	// ���� Ÿ��
	// ������ �ν��Ͻ��� �Ű������� ���;� �� 
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -=1000; // �����ϰ� �ڵ��Ϸ��� �� �л��� 1000�� �̻� ������ �ִ����� Ȯ���ϸ� ���� ��
		
	}
	
	// ����ö Ÿ��
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -=1500;
	}
	
	// ���� ��� ���� �߰� ��
//	public void takeTrans(Trans trans) {
//		
//		
//	}
//	


	
	public void showInfo() {
		System.out.println(studentName + "���� �ܾ��� " + money + "�Դϴ�.");
		
	}
	

}
