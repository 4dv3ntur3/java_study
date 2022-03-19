package cooperation;

public class Bus {
	
	int busNumuber;
	int passengerCount;
	int money;
	
	// 생성자는 자유임
	// 꼭 버스번호가 있어야 한다고 하면 이렇게
	// 그냥 생성이 우선이다 하면 그냥 기본생성자 써 주면 되고 
	public Bus(int busNumuber) {
		this.busNumuber = busNumuber;
		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
		
	}
	
	public void showInfo() {
		System.out.println("버스" + busNumuber + "번의 승객은" + passengerCount  + 
				"명이고, 수익은" + money + "입니다.");
	}

}


