package oop_class;

public class FunctionTest {

	// class 만들 때 public main 체크하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 30;
		
		int num3 = addNum(num1, num2);
		System.out.println(num3);
		
	}
	
	// 함수 선언
	public static int addNum(int n1, int n2) {
		int result; 
		result = n1+n2;
		return result;
		
	}
	
	
	// 함수와 스택 메모리
	// main() -> addNum() 호출 
	/*
	 * 함수를 호출할 때 함수가 사용하는 메모리를 스택 메모리 
	 * 이 스택에서 main함수가 사용하는 지역 변수 
	 * (num1, num2, num3) int니까 4바이트씩 잡힘 12바이트 여기가 main
	 * 근데 addNum을 호출했으니 그 위에 addNum 쌓임 
	 * 사용 변수 n1, n2, result해서 4바이트씩 또 잡힘
	 * num1이 n1로 복사, num2가 n2로 복사, result가 num3으로 반환
	 * 따라서 사용 공간이 다르므로 함수간의 매개변수나 내부의 지역변수 이름 겹쳐도 괜찮
	 * addNum()이 끝나고 return되면 main() 위에 쌓였던 addNum() 메모리는 사라짐
	 * 
	 * 그래서 함수 내에서만 사용하므로 지역변수. 
	 * 
	 * 
	 * 
	 */
	
	
	

}
