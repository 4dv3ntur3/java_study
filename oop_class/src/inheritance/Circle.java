package inheritance;

public class Circle {
	
	// 한 점, 반지름
//	private int x;
//	private int y;
	
	Point point; // has-a 관계 (상속의 의미는 아님)
	
	// 이미 Point class에 int x, y가 구현되어 있다고 해서
	// public class Circle extends Point 이렇게 쓰지는 않는다
	// 한 점과 circle의 관계는 상속의 관계가 아님
	// 일반적 < 구체적이 아니고 그냥 point를 활용하고 싶은 것
	// Point point;로 선언하고 생성자에서 point = new Point();
	// 이게 합성 (참조변수 가져다 쓰는 것)
	 
	
	
	private int radius;

}
