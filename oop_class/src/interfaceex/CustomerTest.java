package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy(); // Buy라는 인터페이스에 담아서 buy만 호출 가능
		
		Sell seller = customer;
		seller.sell(); // Sell이라는 인터페이스에 담아서 sell만 호출 가능
		
		
		// 셋 다 customer에서 overriding된 메서드가 불린다
		customer.order();
		buyer.order(); // 가상 메서드 방식. 현재 assign된 인스턴스가 customer type이기 때문
		seller.order(); // 얘도 마찬가지로 가상 메서드 방식.
		
		
		

	}

}
