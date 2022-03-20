package interfaceex;

public interface Calc {
	
	// �������̽� ������ �̷��� �����ϸ�
	// public static final �� �˾Ƽ� ����� ���� 
	double PI = 3.14;
	int ERROR = -999999999;
	
	// interface �ؿ� ������ �Ǹ� �� public abstract�� Ű���� �־� �� (precompile �ܰ迡��)
	// ���� �������� �ٸ� �� ������, �� �޼����� ����� �װ��̴� ��� �����ϴ� �� �޼��� ������ ����
	// ���迡�� �ϴ� �� : ���� ����� 
	int add (int num1, int num2);
	int sub (int num1, int num2);
	int mul (int num1, int num2);
	int div (int num1, int num2);
	
	// default �޼���. ���� Ŭ�������� ������ �翬�� ����. 
	// �׳� void��� ���� ���� ��. static�̳� void�� �����
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�");
	}
	
	// ���� �޼���
	static int total (int[] arr) {
		int total = 0;
		
		for(int i:arr) {
			total += i;
		}
		return total;
	}
	
	// private �޼���
	// �������̽� ���ο� private or private static���� ����
	
	

}
