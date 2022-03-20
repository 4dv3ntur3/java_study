package interfaceex;

// 구현한다
// interface type을 상속했다 
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}


}
