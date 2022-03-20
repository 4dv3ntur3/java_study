package gamelevel;

public abstract class PlayerLevel {
	
	// 구현할 수 없는 부분
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	// 구현할 수 있는 부분
	// 템플릿 메서드
	final public void go(int count) {
		run();
		
		for (int i=0; i<count; i++) {
			jump();
		}
		
		turn();
	}

	

}
