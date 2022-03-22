package lambda;

public class TestStringConcat {
	
	public static void main(String[] args) {
		
		// 1. oop ���
		// ���� �������̽� implement ����
		// �����ؼ� ��� ����Ѵ�
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		
		// �� �� ���� �� �Ŵ� 
		// 2. fp ��� (���ٽ�)
		// �޼��� �ϳ��ۿ� ���� �� ��
		// �����ؼ� ���� �����
		StringConcat concat = (s1, s2) -> System.out.println(s1+" "+s2);
		concat.makeString("hello", "java");
		
		// 3. �͸� ���� Ŭ���� ���� 
		// �ϳ��� abstract class�� �������̽��� implement�� ����
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1+" "+s2);
			}
		};
		
		concat2.makeString("hello", "java");
	}
	
	// ����
	// �������̽� ���� -> �������̽� �����ϴ� Ŭ���� ����� -> 
	// �� Ŭ���� �����ؼ� �޼��� ȣ��
	// �̰� ���ٽ�����

}
