package template;

public abstract class Car {
	
	// ���� ������ ���� �ٸ� �۵��� (�޸���, ���߰�)
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe();
	
	// ������ �ߴµ� ���� �ڵ尡 ����
	// �̰� �߻� �޼��嵵 �ƴϰ� �����ΰ� �ֱ� ������ ������ �� �߰� 
	// ���뵵 ���� ������ �ƹ��͵� �� �� ��...
	// �� �޼���? 
	// �ʿ信 ���ؼ� �������� ���� ��. ������ ���ص� �������. 
	public void washCar() {}
	
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void OffCar() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	// ���ø� �޼���
	// ���� Ŭ�������� �������� �� ���� 
	// final public void�� ok
	// public final void�� ok
	public final void run() {
		// �Ϸ��� �ó�����
		// �õ� �ɰ� -> �����ϰ� -> ���߰� -> �õ� ���� 
		// ������ �ó������� �ٲ� �� ����!! �޼��带 �������� �� ������ �̰� �ٲ�� �ȵ� -> final
		startCar();
		wipe(); // �̰� �߰��ϸ� ���� Ŭ�������� �� ������. �̰� ��� �̰� �����϶�� 
		drive();
		stop();
		washCar();
		OffCar();
	}
}
