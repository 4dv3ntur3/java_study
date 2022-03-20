package interfaceex;

public interface Calc {
	
	// 인터페이스 내에서 이렇게 선언하면
	// public static final 로 알아서 예약어 붙음 
	double PI = 3.14;
	int ERROR = -999999999;
	
	// interface 밑에 선언이 되면 다 public abstract로 키워드 넣어 줌 (precompile 단계에서)
	// 각각 구현법은 다를 수 있지만, 이 메서드의 기능은 그것이다 라고 정의하는 게 메서드 선언의 역할
	// 설계에서 하는 일 : 뼈대 만들기 
	int add (int num1, int num2);
	int sub (int num1, int num2);
	int mul (int num1, int num2);
	int div (int num1, int num2);
	
	// default 메서드. 하위 클래스에서 재정의 당연히 가능. 
	// 그냥 void라고 쓰면 에러 남. static이나 void로 쓰라고
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
	}
	
	// 정적 메서드
	static int total (int[] arr) {
		int total = 0;
		
		for(int i:arr) {
			total += i;
		}
		return total;
	}
	
	// private 메서드
	// 인터페이스 내부에 private or private static으로 선언
	
	

}
