package jdk_programming;

class Student {
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if (obj instanceof Student) {
			Student std = (Student)obj;
			
			// �й� �������� üũ�ϵ��� ������
			// �й��� ������ �����ϴٰ� �ϵ��� ������
			if(studentID == std.studentID) return true;
			else return false;
		}
		
		return false;
		
		
//		return super.equals(obj);
	}
	
	// ���� �� �л��� �й��� ���ٸ� ���� �л��̹Ƿ� �׳� �й��� return�ϵ��� ������
	public int hashCode() {
		return studentID;
	}
	
	// ���࿡ equals�� �����ϰ� hashcode�� ���� �� �ϸ� hashset ���� Ŭ���� ����� �� 
	// �� ���ư� ���� ����
	// java �������� equlas�� �����ǰ� �Ǿ� ���� �� �� ���� true�� hashcode���� ���ƾ� �� 
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("test1");
		String str2 = new String("test1");

		System.out.println(str1==str2); // false
		
		// String class���� equals ������ �� ����
		// �� ���ڿ� ������ ������ true�� ��ȯ�� (���� ���ϼ�) 
		System.out.println(str1.equals(str2)); // true
		
		Student std1 = new Student(10001, "Thomas");
		Student std2 = new Student(10001, "Thomas");
		
		System.out.println(std1==std2); // false
		System.out.println(std1.equals(std2)); // true
		
		// 10������ ��ȯ (���� �ּҰ��� 16����)
		System.out.println(std1.hashCode()); 
		System.out.println(std2.hashCode());
		
		// �� ���� ���� ����
		// �ֳ��ϸ� String class���� hashcode�� �������� �ױ� ���� 
		// �������� ������ �ν��Ͻ��� ������ �ؽ��ڵ带 ��ȯ�ϴ� �� �´�
		System.out.println(str1.hashCode()); 
		System.out.println(str2.hashCode());
		
		// ������ �� ��¥ �ؽ��ڵ尪
		// String hashcode: string�� ������ �ؽ��ڵ� ¥�� �˰������� ����
		// Integer�� ���������� 
		System.out.println(System.identityHashCode(str1)); 
		System.out.println(System.identityHashCode(str2)); 
		
		
		
		
	}

}
