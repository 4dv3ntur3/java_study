package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		Customer lee = new Customer(10010, "lee");
//		lee.calcPrice(10000);
		int price = lee.calcPrice(10000);
//		System.out.println(lee.showCustomerInfo());
		System.out.println("지불 금액은 "+ price + "이고 " + lee.showCustomerInfo());
		
		VIPCustomer park = new VIPCustomer(10020, "park", 100);
		price = park.calcPrice(10000);
//		System.out.println(park.showCustomerInfo());
		System.out.println("지불 금액은 "+ price + "이고 " + park.showCustomerInfo());
		*/
		
		Customer customerWho = new VIPCustomer(20000, "Who", 100);

		// 이렇게 부르면 VIPCustomer의 calcprice가 호출됨
		// Customer형이라 Customer것만 보이는데 instance게 불림
		// -> 가상함수 
		int price = customerWho.calcPrice(10000);
		
		
		System.out.println("지불 금액은 "+ price + "이고 " + customerWho.showCustomerInfo());
		
		Customer gold = new GoldCustomer();
		// 상속 -> 하위클래스가 상위클래스로 upcasting -> 재정의 가능
		// type이 상위클래스로 upcasting 됐지만 가상 메서드라서 인스턴스 메서드 호출됨
		// 
		
		

	}

}
