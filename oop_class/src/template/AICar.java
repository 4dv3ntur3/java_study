package template;

public class AICar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("���� �����մϴ�");
		System.out.println("�ڵ����� ������ ������ ��ȯ�մϴ�");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ����� ������ ����ϴ�");
	}

	@Override
	public void wipe() {
		// TODO Auto-generated method stub
		System.out.println("�� ���� �翡 ���� �ڵ����� �����˴ϴ�.");
	}

	@Override
	public void washCar() {
		// TODO Auto-generated method stub
		System.out.println("�ڵ����� �����˴ϴ�.");
	}


}