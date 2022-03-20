package witharraylist;

public class Customer {
	
	// 이걸 protected로 선언하면 상속받는 class(다른 패키지에 있어도 괜찮음) 에서는 접근 가능, 나머지 외부 클래스는 접근 불가
	// private 하면 상속받는 class도 접근 불가
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint; 
	// 접근 제어자가 아무것도 없으면 default라서 패키지가 달라지면 가시성이 없어짐 (상속받아도 볼 수 없다)
	// 그래서 접근 불가능한 변수를 사용하고 싶으면 getter setter 
	protected double bonusRatio;
	
	// 가시성
	// private -> default -> protected (패키지가 달라도 상위/하위클래스끼리는 볼 수 있음)
	
	// 단골 고객 기능 추가를 위해 이런 식으로 하게 되면 
	// calcPrice에서 if문 넣어서 고객 등급에 따라 가격 및 포인트 따로 계산해 줘야 함
	// 이 customer class안에 여러 고객 등급별로 if문도 늘어나고...
	// 복잡하고 유지보수가 힘들어질 것임 
	//	private int saleRatio;
	//	private int agentID;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() 호출");
	}
	
	// default 생성자 안 쓰고 무조건 이걸로 쓰겠다
	// 회원가입할 때 id, 이름 같은 거 이런 생성자 만들어서 DB에 넣고 하면 되겠지
	// 그런데 기본 생성자 없이 이렇게 하면? 에러가 남
	// 상속받는 클래스의 생성자에서 super(); 를 부르는데 이게 기본 생성자를 호출함
	// 아무 생성자가 없을 때 기본생성자가 제공되기 떄문에...
	// 하나라도 생성자를 만들었으니까 컴파일러가 기본 생성자를 안 줌.
	// 그래서 두 개 쓸 거면 직접 코딩하는 거고 
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) 호출");
		
	}
	
	
	// 이 메서드는 vipcustomer에서는 맞지 않음! 
	// vip customer에서 calcprice를 똑같이 재정의 가능 
	// 같은 매개변수, 같은 이름. 기능만 다름 (오버라이딩)
	// 오버로딩: 이름이 똑같은 (매개변수는 다르고) 게 여러 개.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 가격을 깎아주지는 않고 포인트만 적립
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
	

}
