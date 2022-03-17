package oop_class;

public class Student {

	// class�� �빮�ڷ� ����
	// ��Ű���� �ҹ���
	// �ϳ��� java �ؿ��� �ϳ��� Ŭ������ ��Ģ
	// ���� ���� class�� ���: public class�� �ϳ��̰�,
	// �� public class�� java ���� �̸��� �����ؾ� ��
	
	// java�� ��� �ڵ�� class ���ο� ��ġ 
	// �ٱ����� �� import ����...? 
	
	int studentID; // ��� ������ �Ķ�������
	String studentName; // �ڹ��� ���ڿ� Ŭ���� String
	int grade;
	String address;
	
	// ������
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	// ������ �����ε�. �̸��� ���������� �Ű������� �ٸ� 

	public Student() {}
	
	// �޼���
	// ���� Ŭ������ ��� ����? 
	// �ٸ� Ŭ�������� ���. 
	// �� ����: ������ ��û�� ���� �ű⼭ �ʿ��� Ŭ������ ������ 
	// ��û�� ���� ó���� �ϱ� ���� Ŭ���� ����, �޼ҵ� ȣ�� 
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	
	// Ŭ������ ����ϴ� �� �������� �޼��� �̸� �ۼ�
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// entry point (Ŭ���� ȣ��(���))�� ���� main code
	
	// ��� 1. Ŭ���� �ȿ��� main 
	/*
	 * public static void main(String[] args) { Student Lee = new Student();
	 * Lee.studentName = "������"; Lee.studentID = 1234567; Lee.address = "���빮�� �źϰ��";
	 * 
	 * Lee.showStudentInfo(); }
	 */
	
	// class �ȿ��� ������ jvm�� main�Լ��� ȣ���ؼ� �갡 ���� �����
	// Ŭ���� ���ο� ������ ����Լ� �ƴϴ�
	// �׻� �־�� �ϴ� �� �ƴ�. ��ü ����� ���� �Լ��� ��. 
	public static void main(String[] args) {
		
		int i = 10; // �⺻ �ڷ���
		
		
		// �̷� Ŭ���� �̸��� ������ ������ Ÿ�� , Park�� ���� ���� 
		Student Park = new Student(); // �⺻ ������ 
		// Park�̶�� ��ü�� heap�� ����
		// Ŭ�����̸��� �� ����� �� �ߴ� �ٸ� �Լ����� object class�� �Լ���
		// ���� �Լ���
		Park.studentName = "�̼���";
		Park.studentID = 100;
		Park.address = "����� ������";
		
		Student Kim = new Student();
		Kim.studentName = "������";
		Kim.studentID = 200;
		Kim.address = "����� ���α�";
		
		Park.showStudentInfo();
		Kim.showStudentInfo();
		
		
	}
	
}
