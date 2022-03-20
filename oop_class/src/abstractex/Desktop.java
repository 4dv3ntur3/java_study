package abstractex; 

// public class Desktop extends Computer
// 도 가능함. 일반 class처럼 사용하지 않고 상속용으로만 사용하는 경우
public class Desktop extends Computer {
	
	// display, typing은 computer에서 구현할 수 없고
	// 하위 클래스에서 구현해야 할 때.
	// 어떻게 구현해야 할지 모를 때 -> abstract 메서드로 둔다. 
	// 데스크탑이 컴퓨터를 상속받게 되면 하위 클래스는 메서드 구현의 책임이 있다 / 상위 클래스가 위임시켰다

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
	
	// 추상 메서드를 구현하거나
	// 구현하지 않을 거면 너도 추상 클래스가 되거나 라고 빨간줄이 뜸 (위저드 안 썼음)
	// 빨간줄에 마우스 갖다대면 선택지 뜬다
	// add an implementation  어쩌고 
	
	// overriding도 가능
	public void turnOn() {
		System.out.println("Desktop turnOn()");
	}

}
