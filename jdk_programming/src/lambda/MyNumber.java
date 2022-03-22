package lambda;

@FunctionalInterface
public interface MyNumber {
	
	int getMaxNumber(int num1, int num2);
	
	// int testNumber(int x, int y);
	// 이렇게 해 버리면 main에서 사용할 때
	// 구현부가 위의 거인지 아래 거인지 모호해짐
	// 따라서 함수형 인터페이스인 경우에는 메서드를 딱 하나만 선언해야 하고
	// annotation 선언 가능 (컴파일 에러를 막기 위해)
	// 넣기 전에는 main에서 빨간줄이 떴는데 지금은 여기서 난다 
	
	// 사용하려는 곳에서
	// 여기 선언된 메서드 구현부 구현해 주고 구현된 람다식의 변수
	// 인터페이스형으로 선언된 변수가 여기서 선언된 메서드를 호출

}
