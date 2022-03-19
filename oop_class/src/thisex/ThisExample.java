package thisex;

class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		// 자기 자신 메모리 (인스턴스)의 year라는 변수에 매개변수 year를 넣는다
		// year = year 하게 되면
		// 코드는 항상 가장 가까운 곳을 참조하게 되기 떄문에 (같은 이름이라)
		// 매개변수 year를 참조하게 됨
		// 들어온 값에 들어온 값을 또 넣어 주는 거니까 그냥 그게 그거임
		// 컴파일 오류는 안 나지만 별 의미 없는 코드가 됨
		// 매개변수 int year가 y라면 괜찮음 잘 들어감 
		// 이클ㄹ비스에서 멤버변수: 파란색으로 표시됨 
		// 자바에서는 보통 같은 이름으로 매개변수를 주기 때문에 (멤버변수랑)
		// this 써야 

		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}


public class ThisExample {
	
	public static void main(String args[]) {
		BirthDay b1 = new BirthDay();
		BirthDay b2 = new BirthDay();
		
		System.out.println(b1); // thisex.BirthDay@1c4af82c
		b1.printThis(); // thisex.BirthDay@1c4af82c
		
		System.out.println(b2); // thisex.BirthDay@1d8d30f7
		b2.printThis(); // thisex.BirthDay@1d8d30f7
		
	}
	

}
