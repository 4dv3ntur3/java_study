package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Customer lee = new Customer();
//		lee.setCustomerID(10100);
//		lee.setCustomerName("Lee");
//		
//		Customer kim = new Customer();
//		lee.setCustomerID(10101);
//		lee.setCustomerName("kim");
//		
		// ���? �ٵ� �� VIPCustomer�� �ٸ� ��Ű�������� ȣ���� �� ����? 
		// Customer�� �ߵǴµ�...
		// ���� ���캸�� 
		VIPCustomer park = new VIPCustomer(10103, "park", 100);
		park.setCustomerID(10103);
		park.setCustomerName("park");
		
		// �̰� �����ϴ� 
		// �ݴ�� vipcustomer�� ���ƿ� ���� ���� (�ٿ�ĳ����)
		Customer son = new VIPCustomer(10104, "son", 101);
		// �����ڰ� vipcustomer�� �ҷȱ� ������ �� ������
		// �ν��Ͻ��� ��� �����ƴµ� Ÿ���� customer�� ������ �� �ִ� ������ �޼��尡 customer ���� �޼���� �������
		// type�� customer
		// son. �ϰ� ctrl space �ؼ� ���� �� �� �ִ� ������ customer�� �͵���
		son.bonusPoint = 1000;

		
		// Customer() ȣ��
//		VIPCustomer() ȣ��
		
		
		
		// string�� �����ϴϱ� println �� �൵ �ǰ� �ƴϸ� �Լ��� println�ϰ� �ٲ㵵 �ǰ�
//		System.out.println(lee.showCustomerInfo());
//		System.out.println(kim.showCustomerInfo());

		
		
		

	}

}
