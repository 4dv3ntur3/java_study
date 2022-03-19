package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student j = new Student("James", 5000);
		Student t = new Student("Thomas", 10000);
		
		Bus bus100 = new Bus(100);
		j.takeBus(bus100); // 생성된 인스턴스 bus100이 들어가야 함 
		j.showInfo();
		bus100.showInfo();
		
		Subway green = new Subway(2); // String으로 2호선 넘겨줘도 괜찮 
		t.takeSubway(green);
		t.showInfo();
		green.showInfo();
	

	}

}
