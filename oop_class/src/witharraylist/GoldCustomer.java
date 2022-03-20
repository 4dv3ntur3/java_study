package witharraylist;

public class GoldCustomer extends Customer {
	
	double saleRatio; // VIPCustomer에 이거 있다고 VIPCustomer를 상속받자? 이건 아님...
	
	public GoldCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		return price - (int)(price *saleRatio);
	}
	
	

}
