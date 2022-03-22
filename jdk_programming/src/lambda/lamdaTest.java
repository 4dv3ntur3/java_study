package lambda;

interface PrintString {
	void showString(String str);
}

// 손에 계속 익어야 함... 
// 함수형 프로그래밍에 대한 꾸준한 공부 필요 (javascript)
public class lamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 하나의 람다식을 여러 방식으로 구현
		
		// 1. 변수에 대입해서 바로 implementation
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showString("test");
		
		
		// 2. implementation 된 자체를 넘겨주는 방법
		showMyString(lambdaPrint);
		
		// 3. implementation한 자체를 반환값으로 넘기는 방법
		PrintString reStr = returnPrint();
		reStr.showString("hello");

	}
	
	// main이 static이라서 얘도 static이어야 함
	// 구현부가 매개변수처럼 넘어옴 
	// 객체가 넘어가는 거니까 당연함 
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
		
	}
	
	// 인터페이스 타입
	public static PrintString returnPrint() {
		return s->System.out.println(s + " world");
	}

}
