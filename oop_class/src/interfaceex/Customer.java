package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("고객 판매 주문");
//		Buy.super.order();
	}
	
	// 여러 인터페이스를 implement 할 때 중복된 default 메서드
	// Buy 인터페이스랑 Sell 인터페이스에 동일한 이름의 default 메서드가 있으면
	// 에러가 난다
	
	

}
