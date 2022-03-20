package abstractex;

public abstract class Laptop extends Computer {
	
	// ctrl + n -> class -> 그 다음에 상속받을 클래스 browse해서 검색창에 클래스이름 검색하면 바로 나옴 

	//wizard에서 만들면 
	// Computer의 추상 메서드를 하위클래스에서 바로 구현하라고 나옴
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Laptop display()");

	}
	
	public void aaa() {}
	
	// 하나는 구현 안 했더니 여전히 빨간 줄...
	// abstract로 변경 

}
