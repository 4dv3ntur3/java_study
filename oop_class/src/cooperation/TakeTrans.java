package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student j = new Student("James", 5000);
		Student t = new Student("Thomas", 10000);
		
		Bus bus100 = new Bus(100);
		j.takeBus(bus100); // ������ �ν��Ͻ� bus100�� ���� �� 
		j.showInfo();
		bus100.showInfo();
		
		Subway green = new Subway(2); // String���� 2ȣ�� �Ѱ��൵ ���� 
		t.takeSubway(green);
		t.showInfo();
		green.showInfo();
	

	}

}
