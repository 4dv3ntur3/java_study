package abstractex;

// abstract �Լ��� ������ �����Ƿ� abstract class�� �Ǿ�� �Ѵٰ� ������ �� 
public abstract class Computer {
	
	// �߻�޼��� + �׳� �޼��� ���� ���� �� ���� 
	
//	public void display() {
//		// ���� �ڵ�
//	}
	
	// ����
	// �Ű�����, �޼��� �̸�, ��ȯ��
	// ���� �ڵ� ������ body�� �ְų� abstract Ű���带 ������� ������ ��� ��
	// {} �̰͵� ���� �Ǹ� �����ΰ� �ִ� ���� �ڵ�� ������
	
	// �޼��� ���� 
	// public int add(int x, int y) {return x+y;}
	// �̸�, ��ȯ��, �Ű����� ���� �� ���� ���� �޾Ƽ� ���� ��ȯ�ϴ� �޼��屸�� ���� ����
	// ���� ������ �ߴٴ� ���� ���� �����ߴٴ� �� (� �Ű������� �޾Ƽ� ��� ����, ��ȯ����)
	
	
	abstract public void display(); // �����ΰ� ���� �Ŵ�
	
	abstract public void typing();
	
	// �߻� Ŭ���� = ����� �ϱ� ���� ����� Ŭ����
	// ȥ�� ���ư��� Ŭ���� �ƴ�. �ν��Ͻ�ȭ �Ұ���. 
	// ���� Ŭ������ �� �߻� Ŭ������ ����ؼ� �����ϰ� ��.
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}

}
