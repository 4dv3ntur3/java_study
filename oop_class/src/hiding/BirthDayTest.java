package hiding;

// 한 java 파일 안에 class가 두개이려면
// public class는 단 하나고, java 파일과 이름이 동일해야 -> 파일 이름 바꾸거나 클래스 이름 바꾸거나 해야 됨

class BirthDay {
	
	// 앞에 public 없이 걍 아무것도 안 쓰고 하는 경우
	// 패키지 내에서는 서로 볼 수 있음. default
	
//	public int day;
//	public int month;
//	public int year;
	
	// 패키지 안에서도 볼 수 없다. 클래스 안에서만.
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		
		// data를 private으로 감춰 놓고
		// setter(퍼블릭 메서드)를 활용해서 처리
		// 무결성 유지 
		// 멤버 변수를 public으로 사용해서 데이터의 무결성에 오류가 생길 수 있다
		// 문제가 생길 수 있다 라고 하면 이렇게 처리해야
		
		// 만약 get은 하고 set은 없애면 그 변수는 read-only인 거임
		
		
		if (month == 2) {
			
			if (day<1 || day>28) {
				System.out.println("날짜 오류!");
			}
			
		}
		
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}

public class BirthDayTest {
	public static void main(String args[]) {
		BirthDay day = new BirthDay();
		
		// public일 때
//		day.month = 2;
//		day.year = 2022;
//		day.day = 30; -> 2/30은 존재하지 않음. 이런 경우? 
		
		// getter setter 사용해야 (private)
		
		day.setMonth(2);
		day.setDay(30);
	}
}
