package staticex;

public class Student {
	
	// �� ���� private static int�� �����ص� �� (�ۿ��� ���� �����ؼ� ������Ű�� �� ��. �ν��Ͻ� ���� ������ �����ϴ� �߿��� ����) 
	// setter, getter ������ �ָ� �� �ʿ�ÿ� ���� setter ��� ok
	// public static int getSerialNum()
	public static int serialNum = 10000;
	int studentId;
	String studentName;
	
	// �л��� ������ �� �� serialNum�� ����
	public Student() {
		serialNum++;
		this.studentId = serialNum;
	}
	
	/*
	 * 	// public static int getSerialNum() {
	 * 		int i = 10; // �������� 
	 * 		i++;
	 * 		System.out.println(i);
	 * 		
	 * 		studentName = "ȫ�浿"; // �̰� �� ��!!! ��� ����=�ν��Ͻ� �����̱� ������
	 * 		// �ν��Ͻ� ������ �ν��Ͻ��� new �� �� ������. �׷��� static�� new ��� �� �� ����.
	 *		// �׷��� �̷��� ���� �������� ���� �ν��Ͻ� ������ ȫ�浿�� �ְ� �Ǵ� ����
	 *		// ����ƽ �޼��忡���� �ν��Ͻ� ������ ����� �� ���� 
	 * 							
	 * 		return serialNum; // static ����. Ŭ���� ����
	 * }
	 * 
	 * 
	 */

	
	
}
