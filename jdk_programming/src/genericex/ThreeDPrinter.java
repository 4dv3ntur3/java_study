package genericex;

// <T>
// <T extends Material> Material을 상속받는 애들만 쓸 수 있다 
public class ThreeDPrinter<T extends Material> {
	
	// 모든 참조자료형을 쓰고싶으면 object로 쓸 수 있음
	// 자료형에 대한 결과를 받으려면 다시 downcasting해야 
//	private Object material; // 모든 클래스의 최상위 클래스
//	// 어떤 재료를 Set을 했을 때 플라스틱이든 파우더든 매핑됨
//
//	public Object getMaterial() {
//		return material;
//	}
//
//	public void setMaterial(Object material) {
//		this.material = material;
//	}

	private T material; // 모든 클래스의 최상위 클래스
	// 어떤 재료를 Set을 했을 때 플라스틱이든 파우더든 매핑됨

	public T getMaterial() {
		return material;
		
		// Type에 제한을 안 두고 그냥 <T>로만 두면 material. < 이건 Object 것밖에 안 보임  
		// 제네릭 프로그래밍이긴 하지만, type에 제한을 둘 수도 있다 <T extends ~ >
		// 이렇게 하면 Material의 메서드들이 보인다 (더 많은 기능을 줄 수 있음) 
		
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	// override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); // Material class의 메서드 
	}
}
