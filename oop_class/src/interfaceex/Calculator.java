package interfaceex;

// �����Ѵ�
// interface type�� ����ߴ� 
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