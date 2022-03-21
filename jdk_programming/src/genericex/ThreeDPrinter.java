package genericex;

// <T>
// <T extends Material> Material�� ��ӹ޴� �ֵ鸸 �� �� �ִ� 
public class ThreeDPrinter<T extends Material> {
	
	// ��� �����ڷ����� ��������� object�� �� �� ����
	// �ڷ����� ���� ����� �������� �ٽ� downcasting�ؾ� 
//	private Object material; // ��� Ŭ������ �ֻ��� Ŭ����
//	// � ��Ḧ Set�� ���� �� �ö�ƽ�̵� �Ŀ���� ���ε�
//
//	public Object getMaterial() {
//		return material;
//	}
//
//	public void setMaterial(Object material) {
//		this.material = material;
//	}

	private T material; // ��� Ŭ������ �ֻ��� Ŭ����
	// � ��Ḧ Set�� ���� �� �ö�ƽ�̵� �Ŀ���� ���ε�

	public T getMaterial() {
		return material;
		
		// Type�� ������ �� �ΰ� �׳� <T>�θ� �θ� material. < �̰� Object �͹ۿ� �� ����  
		// ���׸� ���α׷����̱� ������, type�� ������ �� ���� �ִ� <T extends ~ >
		// �̷��� �ϸ� Material�� �޼������ ���δ� (�� ���� ����� �� �� ����) 
		
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	// override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting(); // Material class�� �޼��� 
	}
}
