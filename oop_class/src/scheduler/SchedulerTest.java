package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//DB 연결
		// 실체도 없는 인터페이스로 어떻게 데이터베이스를 연결해서 쓰냐 
		// JDBC: Java DataBase Connectivity
		// DB가 자바랑 연결되려면 이런 것들이 구현되어야 한다는 명세가 되어 있음
		// Connection, Statement 등이 있음
		// 다 인터페이스임. 구현은 누가? 
		// 이거에 대한 구현은 Oracle, MS-SQL, MYSQL에서 함 
		// 저 인터페이스에 대한 구현을 해서 .jar파일을 주고 우린 이걸 가져다 씀
		// 우리는 이 .jar파일을 열어서 보나요? 아니.. don't care임
		// jar import하고 명세에 기반해서 사용 
		// 구현 코드는 없지만 설계하는 데에 씀. 
		// 이런 것들이 구현이 되어야 한다 는 걸 명세한 것.
		// 다양한 정책으로 구현될 수 있다. 
		// Dao: Data Access Object 모듈이 사용하는 DB가 다 바뀌어야 하는 것
		// 우리 회사는 오라클 못 써요! 
		// property 읽어서 그때그때 맞는 Dao 모듈 바인딩 시켜서 멀티 DB 서포트
		// Connection
		
		
		
		// R->RR, L -> LJ, P -> PA
		System.out.println("전화 상담 배분방식을 선택하세요. R, L, P");
		
		// 입력받기
		int ch = System.in.read(); // 예외 처리 에러 떠서 throw IOException으로
		Scheduler scheduler = null;
		
		
		// RR, LJ, PA가 각각 어떤 기능을 하는 모듈인지는(class)인지는 안다
		// 그런데 그 안을 다 들여다보지 않고 그냥 셋 중에 하나를 고르면 된다 
		
		
		// 다형성
		// 안드로이드의 버튼일 수도, 웹페이지의 radio 일수도...
		// 선택을 하게 되면 그 인터페이스를 구현한 인스턴스가 할당 -> 메서드가 호출된다
		// 나는 똑같은 메서드를 불렀으나 인스턴스가 뭐냐에 따라 구현체가 달라지는 
		if(ch=='R' || ch=='r') {
			scheduler = new RoundRobin();
		}
		
		else if (ch=='L' || ch=='l') {
			scheduler = new LeastJob();
		}
		
		else if (ch=='P' || ch=='p') {
			scheduler = new PriorityAllocation();
		}
		
		else {
			System.out.println("지원하지 않는 기능입니다.");
		}
		
		// 그러고 나서 메서드를 그냥 호출해 주면 됨 
		scheduler.getNextCall();
		scheduler.SendCallToAgent();
	}

}
