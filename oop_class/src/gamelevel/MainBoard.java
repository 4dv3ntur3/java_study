package gamelevel;

// �� ���������� ���� �ۼ��ϰ�
// �翬�� Ŭ������ ���� �ƹ��͵� �����ϱ� ����� �������� �͸��� ������
// �װ� �� �ذ��ؼ� ���������� �����ϰԲ� ����� �� ��ǥ 
public class MainBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		player.play(1); // run�� �θ��� �� �� 
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		
	}

}
