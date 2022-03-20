package gamelevel; 

public class Player {
	
	// level�̶�� ����
	// ���⸦ �� advancedLevel level_1; 
	// �̷��� �����ϰ� ������ �ȵȴ�...
	private PlayerLevel level;
	
	public Player() {
		
		// Beginner�� �� ��������� �ϴ� �Ѵ� 
		level = new BeginnerLevel(); // �� ���⼭ create �ϸ� ��Ŭ������ �˾Ƽ� ��Ӱ��� �ľ��ϰ� ���� 
		level.showLevelMessage();
		
	}
	public PlayerLevel getLevel() {
		return level;
	}

	// setlevel�� �� �ٲ��� 
	// advanced�� ���� ���� �ְ� super�� ���� ���� �����ϱ� ����Ŭ������ 
	
	// �� �κ��� ó���� ���� �򰥸�
	// PlayerLevel�� �޴´ٴ� ��
	// �ݺ����� if else�� ������ ����? -> ��� ��� 
	// level���� 10���� �����.. if (level == 1) �̷� ������...
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	// ��Ŭ���� ���� �ڵ忡�� create ��¼�� ������ �ٷ� ����� �ϴµ� ���� ��ġ �ʴ� �������� 
	// ���̽������� ���� ���� ������ �������ϸ� ���� �ۼ��ϴ� �� ��õ 
	public void play(int count) {
		// TODO Auto-generated method stub
		level.go(count);
		
	}
	
	
	

}
