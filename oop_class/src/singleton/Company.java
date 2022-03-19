package singleton;

public class Company {
	

	// �갡 ������ �ν��Ͻ��� �� 
	private static Company c_instance = new Company();

	
	// private constructor ����
	// �ܺο��� ������ ȣ������ ���ϵ��� �ϰڴ�
	private Company () {}
	
	// �� �ν��Ͻ��� ������ �� �� �ֵ���
	// �׷��� �׳� �޼���� �����ϸ� �ν��Ͻ� ���� ���̴� �� �޼��带 �θ� ���� ����
	// static���� ���� 
	public static Company getInstance() {
		
		// �׷� ���� ��������? 
		if(c_instance == null) {
			c_instance = new Company();
		}
		
		
		return c_instance;
	}


}
