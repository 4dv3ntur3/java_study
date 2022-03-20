package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 오류 남. 추상 클래스는 new 할 수 없다 (인스턴스화 불가능)
//		Computer c1 = new Computer();
//		c1.display();
		Computer c2 = new Desktop();
		// Computer c3 = new Laptop(); // abstract class니까 얘도 안 됨
		Computer c4 = new MyLaptop();
		Laptop c5 = new MyLaptop();
		
		c2.display();
		c4.display();
		
//		c4.aaa() // 는 안됨
		c5.aaa(); // 는 가능 
		

	}

}
