package inheritance;

public class GoldCustomer extends Customer {
	
	// ��Ŭ�� -> source -> override 

	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	
	@Override 
	// annotation (�����Ϸ����� �갡 � ���� �Ѵٴ� �� �˷���) 
	// ������ üũ: �Ű����� ���� �� �´��� 
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return super.getCustomerName();
	}
	
	
	

}
