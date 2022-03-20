package witharraylist;

public class VIPCustomer extends Customer {
	
	// 복사해서 만들고 보니 Customer와 다 겹침 (일부 변수나 생성자 제외)
	// 그래서 extends
	
//	protected int customerID;
//	protected String customerName;
//	protected String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	private double saleRatio;
	private int agentID; // 담당 상담원. 바꾸는 것 제공하지 않겠다 
	
	// super에 기본 생성자가 없다면?
	// super(0, null); 해 주는 방법도 있지만
	// 그냥 상위 클래스 생성자랑 똑같이 받음 
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		// 사실은 여기서 컴파일러가
		// super(); 를 넣어 줌 (precompile 단계에서)
		// Customer class 역시 생성자에 super(); 들어감!
		// 모든 자바 클래스의 최상위 클래스인 Object class를 상속받기 떄문에 얘 생성자를 호출함
		// 자기 자신의 바로 위 상위클래스를 가리키는 참조자를 가진 키워드
		// 자기 자신 가리키는 건 this
		// 이렇게 하면 상위클래스 기본 생성자 호출됨
		
		// 일단 명시적으로 super를 불러야 함
		super(customerID, customerName);
				
		customerGrade = "VIP"; // private로 선언한 상태면 안 보임. 생성돼도 접근 불가
		// 갖다 쓸 수 없다. 그래서 외부 클래스에게는 private이지만 상속관계에서는 public으로 보이게 하는 키워드
		// protected.
		//super.setBonusPoint(10000); // 이렇게도 사용 가능
		// 그냥 setBonusPoint(10000); 해도 됨
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		this.agentID = agentID;
		
		// 이렇게 되면 위의 멤버변수들은 어차피 기본생성자에서 생긴 값 초기화 후
		// 이 값으로 다시 overwrite 될 것
		
//		System.out.println("VIPCustomer() 호출");
		System.out.println("VIPCustomer(int, String) 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	
	// 상위 클래스의 메서드와 같은 이름, 같은 반환형, 같은 매개변수를 가진 메서드를 재정의
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 가격을 깎아주지는 않고 포인트만 적립
		return price - (int)(price*saleRatio);
	}
//	
//	public String showCustomerInfo() {
//		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
//	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다."; 
		// 만약에 여기서 super 빼면 이 함수를 부르기 떄문에 그냥 재귀호출 계속하게 됨
		
	}
	
	

}
