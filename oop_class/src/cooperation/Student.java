package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 객체의 협업 부분
	// 버스 타기
	// 생성된 인스턴스가 매개변수로 들어와야 함 
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -=1000; // 섬세하게 코딩하려면 이 학생이 1000원 이상 가지고 있는지도 확인하면 좋을 것
		
	}
	
	// 지하철 타기
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -=1500;
	}
	
	// 만약 상속 개념 추가 시
//	public void takeTrans(Trans trans) {
//		
//		
//	}
//	


	
	public void showInfo() {
		System.out.println(studentName + "님의 잔액은 " + money + "입니다.");
		
	}
	

}
