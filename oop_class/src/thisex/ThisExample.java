package thisex;

class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		// �ڱ� �ڽ� �޸� (�ν��Ͻ�)�� year��� ������ �Ű����� year�� �ִ´�
		// year = year �ϰ� �Ǹ�
		// �ڵ�� �׻� ���� ����� ���� �����ϰ� �Ǳ� ������ (���� �̸��̶�)
		// �Ű����� year�� �����ϰ� ��
		// ���� ���� ���� ���� �� �־� �ִ� �Ŵϱ� �׳� �װ� �װ���
		// ������ ������ �� ������ �� �ǹ� ���� �ڵ尡 ��
		// �Ű����� int year�� y��� ������ �� �� 
		// ��Ŭ���񽺿��� �������: �Ķ������� ǥ�õ� 
		// �ڹٿ����� ���� ���� �̸����� �Ű������� �ֱ� ������ (���������)
		// this ��� 

		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}


public class ThisExample {
	
	public static void main(String args[]) {
		BirthDay b1 = new BirthDay();
		BirthDay b2 = new BirthDay();
		
		System.out.println(b1); // thisex.BirthDay@1c4af82c
		b1.printThis(); // thisex.BirthDay@1c4af82c
		
		System.out.println(b2); // thisex.BirthDay@1d8d30f7
		b2.printThis(); // thisex.BirthDay@1d8d30f7
		
	}
	

}
