package abstractex; 

// public class Desktop extends Computer
// �� ������. �Ϲ� classó�� ������� �ʰ� ��ӿ����θ� ����ϴ� ���
public class Desktop extends Computer {
	
	// display, typing�� computer���� ������ �� ����
	// ���� Ŭ�������� �����ؾ� �� ��.
	// ��� �����ؾ� ���� �� �� -> abstract �޼���� �д�. 
	// ����ũž�� ��ǻ�͸� ��ӹް� �Ǹ� ���� Ŭ������ �޼��� ������ å���� �ִ� / ���� Ŭ������ ���ӽ��״�

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Desktop display");
		
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("Desktop typing");
		
	}
	
	// �߻� �޼��带 �����ϰų�
	// �������� ���� �Ÿ� �ʵ� �߻� Ŭ������ �ǰų� ��� �������� �� (������ �� ����)
	// �����ٿ� ���콺 ���ٴ�� ������ ���
	// add an implementation  ��¼�� 
	
	// overriding�� ����
	public void turnOn() {
		System.out.println("Desktop turnOn()");
	}

}
