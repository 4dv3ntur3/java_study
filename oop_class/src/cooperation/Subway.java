package cooperation;

// 접근 제어자
// 모든 멤버를 private으로 하는 게 좋은 프로그래밍이 아님
// public으로 오픈해야만 하는 경우도 있고...
// 패키지 내에서 공유해도 된다 싶으면 그냥 default로 둬도 되고 

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;

	// 객체의 멤버변수 값을 바꾸는 함수를 작성할 때
	// 들어오는 매개변수 이름을 멤버변수와 다르게 설정하면 this를 사용할 필요가 없지 않는가?
	// 맞음. 근데 java에서는 보통 이름 맞춰 주는 걸로 가독성을 챙김. 
	// this 사용하는 건 전혀 번거로운 일이 아니다. 
	// 그리고 이름이 같으니까 클릭했을 때 동명의 변수를 잡아 주는 기능이 있어서 그것도 편리함 
	// 다른 곳에서 호출할 때 자동완성 될 때 메서드이름+매개변수가 같이 뜨는데 그때도 보기 편함 
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++; // 이 메서드에서는 매개변수 이름이 안 겹치니까 this 안 써도 됨 
	}

	public void showInfo() {
		System.out.println("지하철" + lineNumber + "호선의 승객은" + passengerCount  + 
				"명이고, 수익은" + money + "입니다.");
	}



}
