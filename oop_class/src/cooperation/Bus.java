package cooperation;

public class Bus {
	
	int busNumuber;
	int passengerCount;
	int money;
	
	// �����ڴ� ������
	// �� ������ȣ�� �־�� �Ѵٰ� �ϸ� �̷���
	// �׳� ������ �켱�̴� �ϸ� �׳� �⺻������ �� �ָ� �ǰ� 
	public Bus(int busNumuber) {
		this.busNumuber = busNumuber;
		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
		
	}
	
	public void showInfo() {
		System.out.println("����" + busNumuber + "���� �°���" + passengerCount  + 
				"���̰�, ������" + money + "�Դϴ�.");
	}

}


