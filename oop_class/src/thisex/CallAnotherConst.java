package thisex;

class Person {
	
	String name;
	int age;
	
	public Person() {
		
		// �⺻ �����ڰ� ȣ����� �� name�� �̸� ����, ���̴� 1�̶�� �ֵ��� �ϰ� �ʹ�
		// �̷��� �� ���� ������ �̹� �̸��̶� ���̸� �־��ִ� �����ڰ� �����Ƿ�
		// �̸� Ȱ������ 
//		name = "�̸�����";
//		age = 1;
		
		// �Ű����� Ÿ��/������ ������ �˾Ƽ� �´� �ɷ� 
		// ���εż� ȣ��
		this("�̸� ����", 1); 
		
		// ������ ��
		// �̷��� this�� �� ���� �� ���� �ٸ� �ڵ�(����)�� �� ���� ����
		// name = "";
		// age = 1;
		// this("�̸� ����", 1); 
		// �̷��� ���� ���� �� 
		// �ֳ��ϸ� ��������� person�̶�� �ν���Ʈ�� �� �����ž� �������. �޸� ������.
		// �׷��� ������ ������ ���� �����ĸ� this�� �Ҹ� ���� 
		// �ٸ� �ʱ�ȭ�� �� �Ͼ ������ ��������� ��
		// �׷��� �����Ϸ��� this�� �θ��� �ǵ�, �� ���� name= �̷� ������ �ϸ�
		// ������ �߻��� �� ���� 
		// �������� ���� �޸𸮿� ���� assign�ϴ� ���� �Ͼ ���� 
		// ���� �̷��� �� ���� this�� �� ��ü�� �����Ǳ� ���ؼ� �ٸ� �����ڸ� �θ��� �Ŵϱ�
		// ���� �� ��ü�� ����� ������ �� �ƴٴ� ����!
		// �׷��� �� ���� �ٸ� statement�� ����� �� ���� 

		
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this; // this�� return�� �� ��ȯ���� class �̸�
		// ���� �ν��Ͻ��� �ּҰ� ��ȯ 
	}
	
}

public class CallAnotherConst {
	
	Person p1 = new Person();
	
	public static void main(String args[]) {
		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf()); // thisex.Person@32d2fa64
	}
	
	

}
