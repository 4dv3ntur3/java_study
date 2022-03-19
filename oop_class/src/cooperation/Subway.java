package cooperation;

// ���� ������
// ��� ����� private���� �ϴ� �� ���� ���α׷����� �ƴ�
// public���� �����ؾ߸� �ϴ� ��쵵 �ְ�...
// ��Ű�� ������ �����ص� �ȴ� ������ �׳� default�� �ֵ� �ǰ� 

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;

	// ��ü�� ������� ���� �ٲٴ� �Լ��� �ۼ��� ��
	// ������ �Ű����� �̸��� ��������� �ٸ��� �����ϸ� this�� ����� �ʿ䰡 ���� �ʴ°�?
	// ����. �ٵ� java������ ���� �̸� ���� �ִ� �ɷ� �������� ì��. 
	// this ����ϴ� �� ���� ���ŷο� ���� �ƴϴ�. 
	// �׸��� �̸��� �����ϱ� Ŭ������ �� ������ ������ ��� �ִ� ����� �־ �װ͵� ���� 
	// �ٸ� ������ ȣ���� �� �ڵ��ϼ� �� �� �޼����̸�+�Ű������� ���� �ߴµ� �׶��� ���� ���� 
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++; // �� �޼��忡���� �Ű����� �̸��� �� ��ġ�ϱ� this �� �ᵵ �� 
	}

	public void showInfo() {
		System.out.println("����ö" + lineNumber + "ȣ���� �°���" + passengerCount  + 
				"���̰�, ������" + money + "�Դϴ�.");
	}



}
