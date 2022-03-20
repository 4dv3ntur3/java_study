package interfaceex;

// client code
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 30;
		// type 상속(도 상속이다)
		Calc calc = new CompleteCalc();
		// CompleteCalc()가 어떻게 생겼는지는 모르지만
		// calc. 해서 그냥 함수랑 매개변수 이름 보고 가져다 쓴다 
		
		
		
		// CompleteCalc calc = new CompleteCalc();
		// Calculator calc = new CompleteCalc(); 도 가능
		System.out.println(calc.add(num1, num2));
		
		// interface의 default method
		calc.description();
		
		// 이 둘은 abstract class 이기 떄문에 인스턴스화(new) 불가
//		Calc calc1 = new Calc();
//		Calc calc2 = new Calculator();
		
		// 인스턴스 생성 없이 인터페이스 이름만으로 호출해서 사용 가능함
		// 정적 메서드 
		int[] arr = {1, 2, 3,4, 5};
		int sum = Calc.total(arr);
		System.out.println(sum);
		

	}

}
