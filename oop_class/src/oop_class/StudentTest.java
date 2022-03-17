package oop_class;

// main �Լ� ���� �� 2��° (�ٸ� Ŭ���� ���Ͽ���)
// �� class�� �̸��� oop_class.StudentClass��

public class StudentTest {
	
	 public static void main(String[] args) { 
		 Student Lee = new Student(); 
		 
		 // ������ ����� ���� ������ ��. �⺻ ������ ���� �� �� �༭. 
		 // 1. �׳� ���� �����ڷ� ����ϰų� 
		 // 2. �⺻ ������ Ŭ���� �ڵ忡 �߰��� �ֱ� 
		 
		 Lee.studentName = "������"; 
		 Lee.studentID = 1234567; 
		 Lee.address = "���빮�� �źϰ��"; 
		 
		 Lee.showStudentInfo(); 
		 
		 System.out.println(Lee); 
		 // �� Lee�� ��������.
		 // oop_class.Student@32d2fa64
		 // ���� ��Ű��.Ŭ�����̸�@16������ ǥ���� ���޸� �ּҰ�. ������.
	 }
	
}


/*
 * C��� �迭 ���� ���� ����Ģ�� �ִ�.
 * ��������� m���� �����ϰ�, ������ i, global ������ g�� ����...
 * java�� ����
 * ��Ű�� �̸��� �ҹ���,
 * class �̸��� �빮��(�ܾ� �ٲ� ����)
 * ����, �Լ� �̸��� �ҹ��ڷ� ����, �ܾ� �ٲ� �� �빮�� (camel notation)
 *
 * ��Ű��: �ҽ��� ����. ��Ű�� �̸� = ����
 * �ҽ��� � ���� ������ ��������. 
 * ��Ű�� ������ ��� ����Ŀ� ���� �ҽ� ������ �޶���.
 * class�� �����ϰ� �� package�̸�.class�̸�
 * 
 * 
 * 
 * 
 * 
 */
