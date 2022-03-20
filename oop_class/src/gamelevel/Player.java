package gamelevel; 

public class Player {
	
	// level이라는 변수
	// 여기를 또 advancedLevel level_1; 
	// 이렇게 선언하고 있으면 안된다...
	private PlayerLevel level;
	
	public Player() {
		
		// Beginner도 안 만들었지만 일단 한다 
		level = new BeginnerLevel(); // 와 여기서 create 하면 이클립스가 알아서 상속관계 파악하고 해줌 
		level.showLevelMessage();
		
	}
	public PlayerLevel getLevel() {
		return level;
	}

	// setlevel을 걍 바꿨음 
	// advanced가 들어올 수도 있고 super가 들어올 수도 있으니까 상위클래스로 
	
	// 이 부분이 처음엔 제일 헷갈림
	// PlayerLevel로 받는다는 것
	// 반복적인 if else가 굉장히 많다? -> 상속 고민 
	// level별로 10개씩 생기고.. if (level == 1) 이런 식으로...
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	// 이클립스 에러 코드에서 create 어쩌고 누르면 바로 생기긴 하는데 내가 원치 않는 방향으로 
	// 베이스라인이 생길 수도 있으니 어지간하면 직접 작성하는 것 추천 
	public void play(int count) {
		// TODO Auto-generated method stub
		level.go(count);
		
	}
	
	
	

}
