package scheduler;

public interface Scheduler {
	// 대기열(Queue)에 고객들의 전화가 쌓이고 이걸 어떻게 배정할 것?
	
	// 상담원 5명한테 하나씩 배정? = round robin
	// 상담을 빨리 처리해야 하니까 되도록이면 대기열이 짧은 상담원한테 우선 배분? = least job
	// 상담원마다 스킬셋이나 숙련도가 다르니까 우선순위를 둬서 배분? = priority
	
	// 정책(strategy)이 여러 개가 있으므로 각 정책마다 이 두 개를 구현(implement)하면 된다
	void getNextCall();
	void SendCallToAgent();
	
	// client는 그냥 scheduler라는 type을 구현한 어떤 class들이 있는지
	// 저 scheduler interface만 보고 가져다 씀 (spec, 계약서)
	

}
