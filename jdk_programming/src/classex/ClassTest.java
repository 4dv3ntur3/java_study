package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		// � class�� ������ �˾ƿ� �� ���� 
//		Class c 
		// ���ݿ� �ִ� class �ε�
		// local���� �� �� ���� class�� ����ؾ� �� �� (reflection programming)
		// ����� �������� �� �־ �̷� ���� �� ����...
		// �ȵ���̵�? 
		
		// Class.forName("Ŭ���� �̸�") �޼���� �߿��ϴ�
		
		// �̸� �������� ��� 3���� 
		// 1, 2 ���� ���� person�̶�� Ŭ������ �����ϵǾ� �־�� ��� ���� (static �ε�)
		// ������ Ÿ���� �� �¾ƾ� ������
		// 3 ���� ���� ���ڿ��� ���� ������ �� �̸��� Ŭ������ ������ �� Ŭ������ �޸𸮿� �ε� (���� �ε�)***
		// ��� �������� �� ��... �ٵ� run time�� ���� 
		// 1. �̹� ������ �ν��Ͻ��� ������ Object�� getClass �޼��� 
		Person person = new Person();
		Class pClass = person.getClass();
		System.out.println(pClass.getName()); // classex.Person (Ŭ������ Ǯ ����: ��Ű��.Ŭ�����̸�)
		
		// 2. 
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName()); // classex.Person 
		// 3. �� ����� ��!!!
		Class pClass3 = Class.forName("classex.Person"); // classex.Person
		// �� Ŭ������ ������ ���� ���� ������ �ϴ� string���� ó���Ǳ� ������ �����ϱ� ������ �𸥴� 
		// �׷��Ƿ� exception throws
		
		// reflection programming 
		Person p = new Person();
		Person p2 = (Person)pClass3.newInstance(); // deprecated ����
		// newInstance()�� �Ҹ��� default constructor ȣ��� 
		// �ٸ� ������ ������ Constructor[] �� �����ͼ� ���� ��
		System.out.println(p);
		System.out.println(p2);
		
		
		
	}
	

}
