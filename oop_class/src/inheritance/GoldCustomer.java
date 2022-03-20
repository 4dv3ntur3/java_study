package inheritance;

public class GoldCustomer extends Customer {
	
	// 우클릭 -> source -> override 

	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	
	@Override 
	// annotation (컴파일러에게 얘가 어떤 일을 한다는 걸 알려줌) 
	// 컴파일 체크: 매개변수 같은 게 맞는지 
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
