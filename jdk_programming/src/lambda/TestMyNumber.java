package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if�� �����ص� ������ ���ٽ��� ������ �� �ִ� �� �����ϴ� �� ����
		MyNumber maxNum = (x, y) -> (x>=y)? x: y;
		
		
		
		int max = maxNum.getMaxNumber(10, 20);
		// ������ ����� max�� ��ȯ��
		
		System.out.println(max);
		// �����ο� ���ΰ� �ٸ� ���� ���� ���� ����
		
		
		int i = 100;
		// ����� ���������� �͸� ���� Ŭ������ ����� ���� 
		MyNumber aaa = new MyNumber() {
			
			@Override
			public int getMaxNumber(int num1, int num2) {
				// TODO Auto-generated method stub
				i = 200; 
				// �̷��� ����! ���� �޼��� ������������ �� Ŭ������ ���� �ֱⰡ �� �� �� i�� final�� ó���ϱ� ������ �Ұ�
				// ��� ���� ������ ���������� ������ �Ұ� 
				return 0;
			}
		};
		
	}
	

}
