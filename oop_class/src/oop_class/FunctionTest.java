package oop_class;

public class FunctionTest {

	// class ���� �� public main üũ�ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 30;
		
		int num3 = addNum(num1, num2);
		System.out.println(num3);
		
	}
	
	// �Լ� ����
	public static int addNum(int n1, int n2) {
		int result; 
		result = n1+n2;
		return result;
		
	}
	
	
	// �Լ��� ���� �޸�
	// main() -> addNum() ȣ�� 
	/*
	 * �Լ��� ȣ���� �� �Լ��� ����ϴ� �޸𸮸� ���� �޸� 
	 * �� ���ÿ��� main�Լ��� ����ϴ� ���� ���� 
	 * (num1, num2, num3) int�ϱ� 4����Ʈ�� ���� 12����Ʈ ���Ⱑ main
	 * �ٵ� addNum�� ȣ�������� �� ���� addNum ���� 
	 * ��� ���� n1, n2, result�ؼ� 4����Ʈ�� �� ����
	 * num1�� n1�� ����, num2�� n2�� ����, result�� num3���� ��ȯ
	 * ���� ��� ������ �ٸ��Ƿ� �Լ����� �Ű������� ������ �������� �̸� ���ĵ� ����
	 * addNum()�� ������ return�Ǹ� main() ���� �׿��� addNum() �޸𸮴� �����
	 * 
	 * �׷��� �Լ� �������� ����ϹǷ� ��������. 
	 * 
	 * 
	 * 
	 */
	
	
	

}
