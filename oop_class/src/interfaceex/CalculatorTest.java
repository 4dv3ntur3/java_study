package interfaceex;

// client code
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 30;
		// type ���(�� ����̴�)
		Calc calc = new CompleteCalc();
		// CompleteCalc()�� ��� ��������� ������
		// calc. �ؼ� �׳� �Լ��� �Ű����� �̸� ���� ������ ���� 
		
		
		
		// CompleteCalc calc = new CompleteCalc();
		// Calculator calc = new CompleteCalc(); �� ����
		System.out.println(calc.add(num1, num2));
		
		// interface�� default method
		calc.description();
		
		// �� ���� abstract class �̱� ������ �ν��Ͻ�ȭ(new) �Ұ�
//		Calc calc1 = new Calc();
//		Calc calc2 = new Calculator();
		
		// �ν��Ͻ� ���� ���� �������̽� �̸������� ȣ���ؼ� ��� ������
		// ���� �޼��� 
		int[] arr = {1, 2, 3,4, 5};
		int sum = Calc.total(arr);
		System.out.println(sum);
		

	}

}
