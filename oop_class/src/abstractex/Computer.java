package abstractex;

// abstract 함수를 가지고 있으므로 abstract class가 되어야 한다고 빨간줄 뜸 
public abstract class Computer {
	
	// 추상메서드 + 그냥 메서드 전부 가질 수 있음 
	
//	public void display() {
//		// 구현 코드
//	}
	
	// 선언만
	// 매개변수, 메서드 이름, 반환형
	// 구현 코드 없으면 body를 넣거나 abstract 키워드를 넣으라고 빨간줄 경고가 뜸
	// {} 이것도 적게 되면 구현부가 있는 거임 코드는 없지만
	
	// 메서드 선언 
	// public int add(int x, int y) {return x+y;}
	// 이름, 반환값, 매개변수 보고 두 개의 값을 받아서 합을 반환하는 메서드구나 추측 가능
	// 따라서 선언을 했다는 것은 반은 구현했다는 뜻 (어떤 매개변수를 받아서 어떻게 연산, 반환할지)
	
	
	abstract public void display(); // 구현부가 없을 거다
	
	abstract public void typing();
	
	// 추상 클래스 = 상속을 하기 위해 만드는 클래스
	// 혼자 돌아가는 클래스 아님. 인스턴스화 불가능. 
	// 하위 클래스가 이 추상 클래스를 기반해서 구현하게 됨.
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

}
