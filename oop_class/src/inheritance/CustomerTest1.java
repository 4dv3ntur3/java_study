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
		// 어라? 근데 왜 VIPCustomer는 다른 패키지에서는 호출이 안 되지? 
		// Customer는 잘되는디...
		// 이유 살펴보기 
		VIPCustomer park = new VIPCustomer(10103, "park", 100);
		park.setCustomerID(10103);
		park.setCustomerName("park");
		
		// 이게 가능하다 
		// 반대로 vipcustomer로 돌아올 수도 있음 (다운캐스팅)
		Customer son = new VIPCustomer(10104, "son", 101);
		// 생성자가 vipcustomer로 불렸기 때문에 다 생성됨
		// 인스턴스는 모두 생성됐는데 타입이 customer라서 접근할 수 있는 변수나 메서드가 customer 것의 메서드와 멤버변수
		// type만 customer
		// son. 하고 ctrl space 해서 보면 볼 수 있는 변수가 customer의 것들임
		son.bonusPoint = 1000;

		
		// Customer() 호출
//		VIPCustomer() 호출
		
		
		
		// string을 리턴하니까 println 해 줘도 되고 아니면 함수를 println하게 바꿔도 되고
//		System.out.println(lee.showCustomerInfo());
//		System.out.println(kim.showCustomerInfo());

		
		
		

	}

}
