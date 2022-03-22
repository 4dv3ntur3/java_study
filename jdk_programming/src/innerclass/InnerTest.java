package innerclass;

import java.util.ArrayList;

import innerclass.OutClass.InStaticClass;

class OutClass {
	
	int num = 10;
	private static int sNum = 30;
	// private InClass inClass; // private 하면 밖에서 outclass.inclass.() 이렇게 못 씀
	InClass inClass;
	private ArrayList list;
	
	public OutClass() {
		// 내부에 있는 클래스일 뿐 생성자에서 생성하는 건 똑같음 (인스턴스일 경우)
		// outclass 생긴 이후에 생긴다 
		inClass = new InClass();
	}
	
	// 인스턴스 내부 클래스.
	// static도 없고 메서드 안에서 쓰이지도 않음 
	class InClass {
		int inNum = 200;
		
		// 이렇게는 사용 불가
		// 인스턴스 생성과 상관없이 사용, 호출할 수 있어야 하는데 얘는 그렇지 않음
		// 그러므로 인스턴스 내부 클래스에서는 static 사용 불가
		// static int sInNum = 100;
		
		// 모든 내부클래스는 외부클래스에 대한 참조값을 가지고 있고
		// 외부클래스 안에 있으므로 모든 변수와 메서드 사용 가능
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	
		// 인스턴스 내부 클래스에서는 static 메서드도 불가
		// 해야 하는데 왜 빨간줄 안 생기는지???????
		static void sTest() {
			
		}
	}
	
	public void usingInTest() {
		inClass.inTest();
		// 보통은 다 private 해 놓고 이런 식으로 쓰도록 함 
	}
	
	
	// static 내부 클래스
	// outClass에서 생성할 수도 있지만 ouclass의 생성과 상관없이 사용 가능함 
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// num += 10; // 외부클래스의 인스턴스 변수를 쓸 수 없다
			// 생성과 상관없이 사용 가능한데, num은 외부 클래스의 멤버변수이므로
			// 생성 전에 참조하는 참사가 일어날 수도 
			sNum += 10; // 정적 변수는 또 가능함
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		// 정적 메서드이기 때문에 정적 변수는 사용 불가
		// 이 클래스의 생성과 상관없이 호출되는 메서드이기 떄문 
		static void sTest() {
			System.out.println(sNum);
//			System.out.println(iNum);
			System.out.println(sInNum);
		}
	}
}
 
public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		OutClass outClass = new OutClass();
//		outClass.inClass.inTest();
//		
//		OutClass.InClass inClass = outClass.new InClass();
//		inClass.inTest();
//		
//		
//		// 정적 내부 클래스
//		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
//		sInClass.inTest(); // 인스턴스 메서드라서 클래스 생성 후에 호출되어야 
		
		// 위에 클래스 생성 없어도 호출됨 
		OutClass.InStaticClass.sTest();
	}

}
