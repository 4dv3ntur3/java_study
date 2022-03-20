package template;

public abstract class Car {
	
	// 차의 종류에 따라서 다른 작동법 (달리고, 멈추고)
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe();
	
	// 구현은 했는데 구현 코드가 없다
	// 이건 추상 메서드도 아니고 구현부가 있기 때문에 에러도 안 뜨고 
	// 내용도 없기 떄문에 아무것도 안 뜰 뿐...
	// 훅 메서드? 
	// 필요에 의해서 재정의해 쓰는 것. 재정의 안해도 상관없음. 
	public void washCar() {}
	
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void OffCar() {
		System.out.println("시동을 끕니다");
	}
	
	// 템플릿 메서드
	// 하위 클래스에서 재정의할 수 없다 
	// final public void도 ok
	// public final void도 ok
	public final void run() {
		// 일련의 시나리오
		// 시동 걸고 -> 운전하고 -> 멈추고 -> 시동 끄고 
		// 하지만 시나리오는 바뀔 수 없다!! 메서드를 재정의할 수 있지만 이건 바뀌면 안됨 -> final
		startCar();
		wipe(); // 이거 추가하면 하위 클래스에서 다 오류남. 이거 없어서 이거 구현하라고 
		drive();
		stop();
		washCar();
		OffCar();
	}
}
