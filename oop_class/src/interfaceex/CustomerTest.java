package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy(); // Buy��� �������̽��� ��Ƽ� buy�� ȣ�� ����
		
		Sell seller = customer;
		seller.sell(); // Sell�̶�� �������̽��� ��Ƽ� sell�� ȣ�� ����
		
		
		// �� �� customer���� overriding�� �޼��尡 �Ҹ���
		customer.order();
		buyer.order(); // ���� �޼��� ���. ���� assign�� �ν��Ͻ��� customer type�̱� ����
		seller.order(); // �굵 ���������� ���� �޼��� ���.
		
		
		

	}

}
