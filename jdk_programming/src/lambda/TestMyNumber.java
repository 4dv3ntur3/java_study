package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if로 구현해도 되지만 람다식은 생략할 수 있는 건 생략하는 게 좋음
		MyNumber maxNum = (x, y) -> (x>=y)? x: y;
		
		
		
		int max = maxNum.getMaxNumber(10, 20);
		// 구현된 결과가 max에 반환됨
		
		System.out.println(max);
		// 구현부와 사용부가 다른 곳에 있을 수도 있음
		
		
		int i = 100;
		// 사실은 내부적으로 익명 내부 클래스가 생기는 것임 
		MyNumber aaa = new MyNumber() {
			
			@Override
			public int getMaxNumber(int num1, int num2) {
				// TODO Auto-generated method stub
				i = 200; 
				// 이러면 에러! 위의 메서드 지역변수보다 이 클래스의 수명 주기가 더 길어서 저 i를 final로 처리하기 떄문에 불가
				// 출력 등의 참조는 가능하지만 변경은 불가 
				return 0;
			}
		};
		
	}
	

}
