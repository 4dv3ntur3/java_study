package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 불가능!!!!
		// Company 인스턴스를 한 개만 만들도록 제한하고 싶음 
		// 이걸 프로그램적으로 설계 
		// new로는 못 만들게 해야 함 
//		Company company = new Company();
//		Company company2 = new Company();
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		Company c3 = new Company(); //error
		System.out.println(c1==c2); // True로 출력되도록 프로그래밍해라 -> singleton
		
		// 동일한 값
		System.out.println(c1); // singleton.Company@32d2fa64
		System.out.println(c2); // singleton.Company@32d2fa64
		
		// 이런 식으로 사용 
//		Calendar cal = Calendar.getInstance();

		

	}

}
