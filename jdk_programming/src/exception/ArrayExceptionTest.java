package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// f1 ������ javadoc ���� 
		// �ܿ� �ʿ� ���� ���� ���� �ܿ�� �� 
		// Exception
		
		int[] arr = {1, 2, 3, 4, 5};
		try {
			// try�� {} �ȿ��� �����ϴ� ���� ������ �߻��Ѵٸ�
			for(int i =0; i<=5; i++) {
				System.out.println(arr[i]);
			}
			// runtime exception (���α׷����� ���ٰ� �߻�)
			
		// �� ������ �̰Ŷ�� ����� ���´� 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e); // ����ٰ� �α� 
//			System.out.println(e.toString()); �� �Ҹ� ����
			return;
		} finally {
			System.out.println("finally");
			// ������ return�ؼ� end�� �� �����µ� ��� ����
			// finally ���� ���� �� return ������
			// try ����Ǹ� ������ ����Ǵ� ����
		}
		// �ý����� ������ �̰� ��� �ȵ� 
		// ���ܰ� ���� ���α׷��� ������ ���� �� 
		System.out.println("end");
	}
	
}


