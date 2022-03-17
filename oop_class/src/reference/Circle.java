package reference;

public class Circle {
	
	// x, y는 점을 나타냄 -> Point Class로 따로 선언해서 사용
	//	int x;
	//	int y;
	
	Point point; // 클래스 안에서 다른 클래스를 참조 변수로 가져다씀 
	int radius;
	
	public Circle() {
		point = new Point();
	}

	
}
