package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
	
	public static void main(String args[]) {
		
		// 이렇게 핸들링해서
		// 오버라이딩 돼 있는 메서드가 자연스럽게 호출
		// 코드를 더 깔끔하게 관리 가능 
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10011, "신사임당");
		Customer hong = new GoldCustomer(10012, "홍길동");
		Customer yul = new GoldCustomer(10013, "이율곡");
		Customer kim = new VIPCustomer(10014, "김유신", 12345);
		
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(yul);
		customerList.add(kim);
		
		System.out.println("======== 고객 정보 출력 ===========");
		
		for (Customer c: customerList) {
			System.out.println(c.showCustomerInfo());
		}
		
		System.out.println("======== 할인율과 보너스 포인트 결과 ===========");
		
		int price = 10000;
		
		for (Customer c: customerList) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName()+ "님이 " + cost + "를 지불하셨습니다.");
			System.out.println(c.showCustomerInfo());
		}
		
		
	}

	
}
