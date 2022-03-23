package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// java 9 ���Ĵ� AutoCloseObj �ۿ��� �����ϰ� 
		// try(obj) �̷� ������ �ص� ���� �� ��
		// �������� ������������ �� �ϰ� ������ �� ����� �� 
		
		
		// ���������� ����Ǹ� �׳� close�� �Ҹ��� 
		// Autocloseable�� ������ Ŭ������ finally�� �� �� �൵ �ȴ�
		try(AutoCloseObj obj = new AutoCloseObj()) {
			// ������ exception �̽����Ѽ�
			throw new Exception(); // �̷��� �ϸ� close �ǰ� ���� ���� �߻���
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
