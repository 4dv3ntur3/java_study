package lambda;

public class TestStringConcat {
	
	public static void main(String[] args) {
		
		// 1. oop 방식
		// 여러 인터페이스 implement 가능
		// 구현해서 계속 사용한다
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		
		// 한 번 쓰고 말 거다 
		// 2. fp 방식 (람다식)
		// 메서드 하나밖에 구현 못 함
		// 간단해서 많이 사용함
		StringConcat concat = (s1, s2) -> System.out.println(s1+" "+s2);
		concat.makeString("hello", "java");
		
		// 3. 익명 내부 클래스 구현 
		// 하나의 abstract class나 인터페이스만 implement만 가능
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1+" "+s2);
			}
		};
		
		concat2.makeString("hello", "java");
	}
	
	// 기존
	// 인터페이스 선언 -> 인터페이스 구현하는 클래스 만들고 -> 
	// 그 클래스 생성해서 메서드 호출
	// 이걸 람다식으로

}
