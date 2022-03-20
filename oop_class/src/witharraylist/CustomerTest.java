package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
	
	public static void main(String args[]) {
		
		// �̷��� �ڵ鸵�ؼ�
		// �������̵� �� �ִ� �޼��尡 �ڿ������� ȣ��
		// �ڵ带 �� ����ϰ� ���� ���� 
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer lee = new Customer(10010, "�̼���");
		Customer shin = new Customer(10011, "�Ż��Ӵ�");
		Customer hong = new GoldCustomer(10012, "ȫ�浿");
		Customer yul = new GoldCustomer(10013, "������");
		Customer kim = new VIPCustomer(10014, "������", 12345);
		
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(yul);
		customerList.add(kim);
		
		System.out.println("======== �� ���� ��� ===========");
		
		for (Customer c: customerList) {
			System.out.println(c.showCustomerInfo());
		}
		
		System.out.println("======== �������� ���ʽ� ����Ʈ ��� ===========");
		
		int price = 10000;
		
		for (Customer c: customerList) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName()+ "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(c.showCustomerInfo());
		}
		
		
	}

	
}
