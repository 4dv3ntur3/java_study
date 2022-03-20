package interfaceex;

// 구현 상속
public class CompleteCalc extends Calculator {

	@Override
	public int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		// TODO Auto-generated method stub
		
		if (num2 != 0) {
			return num1/num2;

		}
		
		// 상속받았음 
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현했습니다.");
	}

}
