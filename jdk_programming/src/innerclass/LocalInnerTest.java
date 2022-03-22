package innerclass;

class Outer {
	
	int outNum = 100;
	static int sNum = 200;
	
//	Runnable runnable; 하고 만들 수도 있지만 굳이?
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("runnable");
			
		}
	};
	
	// 지역 내부 클래스
	
	public Runnable getRunnable(int i) {
		
		int localNum = 100;
	
		// Runnable은 인터페이스
		// 스레드 생성하는 것
		
		/*
		class MyRunnable implements Runnable {

			@Override
			public void run() {
				
				// 값을 변경시키고 있음
				// 변수의 유효성
				// localNum: Outer class의 getRunnable이라는 메서드의 매개변수와 지역변수
				// -> stack: 메서드 호출 끝나면 없어짐
				// runnable.run() 호출하고 나면 없어질 변수들
				// 따라서 사용하는 건 상관없지만, 바꾸는 건 안됨 (지역변수만)
				
//				localNum += 100;
//				i += 200;
//				
				outNum += 10; // 이건 괜찮음. 인스턴스 변수니까 
				
				// TODO Auto-generated method stub
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
				
			}
		}
		
		// Runnable 클래스 만들고 Runnable한 객체를 구현(생성)해서 반환
		// return new MyRunnable();
		 * 
		*/
		
		// local inner class에서 이름을 없앤게 익명 내부 클래스 
		// 클래스 메서드 내 매개변수(지역변수)는 여전히 변경 불가
		// Runnable이 딱 두 번 나오는데 여기서부터 여기서까지만 쓰이니까 의미가 없다
		// -> class 이름이 의미가 없으므로 없앤다 
		
		// getRunnable()을 부르면 바로 러너블 객체 생성해서 반환해 주겠다 
		return new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				outNum += 10; // 이건 괜찮음. 인스턴스 변수니까 
				
				// TODO Auto-generated method stub
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);
				
			}
		};
	
		
		
			
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer outer = new Outer();
//		outer.getRunnable().run(); // 지금 int i 받는 걸로 바꿔놓고 실습해서 안됨
		//outer.getRunnable(20).run();
		
		Runnable runnable = outer.getRunnable(20);
		// run을 호출하기 전에 getRunnable()을 호출
		// 이러면 run()을 호출하는 시점에 
		// getrunnable의 매개변수나 지역변수는 stack에서 사라져 있을 수도 있음
		// 지역 내부 클래스에 사용되는 변수는 final로 -> 상수화 -> 값 못 바뀜 
		// 상수 잡히는 공간에 변수가 잡힘. 아무튼 final로 잡든 그냥 두든 값을 바꿀 수 없다 
		
		
		
		runnable.run();
		
		// 익명 내부 클래스 
		// 안드로이드에서 스레드 만들 때도 이렇게 많이 씀 
		outer.runnable.run();
	}

}
