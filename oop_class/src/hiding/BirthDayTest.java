package hiding;

// �� java ���� �ȿ� class�� �ΰ��̷���
// public class�� �� �ϳ���, java ���ϰ� �̸��� �����ؾ� -> ���� �̸� �ٲٰų� Ŭ���� �̸� �ٲٰų� �ؾ� ��

class BirthDay {
	
	// �տ� public ���� �� �ƹ��͵� �� ���� �ϴ� ���
	// ��Ű�� �������� ���� �� �� ����. default
	
//	public int day;
//	public int month;
//	public int year;
	
	// ��Ű�� �ȿ����� �� �� ����. Ŭ���� �ȿ�����.
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		// data�� private���� ���� ����
		// setter(�ۺ� �޼���)�� Ȱ���ؼ� ó��
		// ���Ἲ ���� 
		// ��� ������ public���� ����ؼ� �������� ���Ἲ�� ������ ���� �� �ִ�
		// ������ ���� �� �ִ� ��� �ϸ� �̷��� ó���ؾ�
		
		// ���� get�� �ϰ� set�� ���ָ� �� ������ read-only�� ����
		
		
		if (month == 2) {
			
			if (day<1 || day>28) {
				System.out.println("��¥ ����!");
			}
			
		}
		
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}

public class BirthDayTest {
	public static void main(String args[]) {
		BirthDay day = new BirthDay();
		
		// public�� ��
//		day.month = 2;
//		day.year = 2022;
//		day.day = 30; -> 2/30�� �������� ����. �̷� ���? 
		
		// getter setter ����ؾ� (private)
		
		day.setMonth(2);
		day.setDay(30);
	}
}
