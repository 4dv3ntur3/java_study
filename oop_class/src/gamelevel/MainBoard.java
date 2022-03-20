package gamelevel;

// 이 실행파일을 먼저 작성하고
// 당연히 클래스고 뭐고 아무것도 없으니까 생기는 에러들이 와르르 떨어짐
// 그걸 다 해결해서 정상적으로 동작하게끔 만드는 게 목표 
public class MainBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		player.play(1); // run을 부르게 될 것 
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		
	}

}
