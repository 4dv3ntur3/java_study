package gamelevel;

public abstract class PlayerLevel {
	
	// ������ �� ���� �κ�
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	// ������ �� �ִ� �κ�
	// ���ø� �޼���
	final public void go(int count) {
		run();
		
		for (int i=0; i<count; i++) {
			jump();
		}
		
		turn();
	}

	

}
