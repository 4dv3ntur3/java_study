package genericex;

// 제네릭 프로그래밍
// 이 재료들의 상위 클래스를 만들어 놓고 그걸 상속받게끔 (T에 대한 제한)
public class Plastic extends Material {
	
	public String toString() {
		return "재료는 Plastic입니다.";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("Plastic 재료로 출력합니다.");
		
	}
	

}
