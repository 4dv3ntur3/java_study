package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Ұ���!!!!
		// Company �ν��Ͻ��� �� ���� ���鵵�� �����ϰ� ���� 
		// �̰� ���α׷������� ���� 
		// new�δ� �� ����� �ؾ� �� 
//		Company company = new Company();
//		Company company2 = new Company();
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		Company c3 = new Company(); //error
		System.out.println(c1==c2); // True�� ��µǵ��� ���α׷����ض� -> singleton
		
		// ������ ��
		System.out.println(c1); // singleton.Company@32d2fa64
		System.out.println(c2); // singleton.Company@32d2fa64
		
		// �̷� ������ ��� 
//		Calendar cal = Calendar.getInstance();

		

	}

}
