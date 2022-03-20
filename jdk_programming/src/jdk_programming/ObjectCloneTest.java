package jdk_programming;

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x="+x+"y="+y;
	}
}

class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String toString() {
		return "원점은 " + this.point + "이고, 반지름은" + radius + "입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle(10, 20, 5);
		Circle cloneCircle = (Circle)circle.clone();
		// 그냥 하면 에러가 남. exception throws
		
		// 이렇게 하면 cloneNotSupportedException
		// clonable하지 않다! 
		// implements Cloneable 선언해야 한다 
		// mark interface
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(cloneCircle));

		System.out.println(circle.toString());
		System.out.println(cloneCircle.toString());
	}

}
