package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		Customer lee = new Customer(10010, "lee");
//		lee.calcPrice(10000);
		int price = lee.calcPrice(10000);
//		System.out.println(lee.showCustomerInfo());
		System.out.println("���� �ݾ��� "+ price + "�̰� " + lee.showCustomerInfo());
		
		VIPCustomer park = new VIPCustomer(10020, "park", 100);
		price = park.calcPrice(10000);
//		System.out.println(park.showCustomerInfo());
		System.out.println("���� �ݾ��� "+ price + "�̰� " + park.showCustomerInfo());
		*/
		
		Customer customerWho = new VIPCustomer(20000, "Who", 100);

		// �̷��� �θ��� VIPCustomer�� calcprice�� ȣ���
		// Customer���̶� Customer�͸� ���̴µ� instance�� �Ҹ�
		// -> �����Լ� 
		int price = customerWho.calcPrice(10000);
		
		
		System.out.println("���� �ݾ��� "+ price + "�̰� " + customerWho.showCustomerInfo());
		
		Customer gold = new GoldCustomer();
		// ��� -> ����Ŭ������ ����Ŭ������ upcasting -> ������ ����
		// type�� ����Ŭ������ upcasting ������ ���� �޼���� �ν��Ͻ� �޼��� ȣ���
		// 
		
		

	}

}
