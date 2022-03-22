package innerclass;

import java.util.ArrayList;

import innerclass.OutClass.InStaticClass;

class OutClass {
	
	int num = 10;
	private static int sNum = 30;
	// private InClass inClass; // private �ϸ� �ۿ��� outclass.inclass.() �̷��� �� ��
	InClass inClass;
	private ArrayList list;
	
	public OutClass() {
		// ���ο� �ִ� Ŭ������ �� �����ڿ��� �����ϴ� �� �Ȱ��� (�ν��Ͻ��� ���)
		// outclass ���� ���Ŀ� ����� 
		inClass = new InClass();
	}
	
	// �ν��Ͻ� ���� Ŭ����.
	// static�� ���� �޼��� �ȿ��� �������� ���� 
	class InClass {
		int inNum = 200;
		
		// �̷��Դ� ��� �Ұ�
		// �ν��Ͻ� ������ ������� ���, ȣ���� �� �־�� �ϴµ� ��� �׷��� ����
		// �׷��Ƿ� �ν��Ͻ� ���� Ŭ���������� static ��� �Ұ�
		// static int sInNum = 100;
		
		// ��� ����Ŭ������ �ܺ�Ŭ������ ���� �������� ������ �ְ�
		// �ܺ�Ŭ���� �ȿ� �����Ƿ� ��� ������ �޼��� ��� ����
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	
		// �ν��Ͻ� ���� Ŭ���������� static �޼��嵵 �Ұ�
		// �ؾ� �ϴµ� �� ������ �� �������???????
		static void sTest() {
			
		}
	}
	
	public void usingInTest() {
		inClass.inTest();
		// ������ �� private �� ���� �̷� ������ ������ �� 
	}
	
	
	// static ���� Ŭ����
	// outClass���� ������ ���� ������ ouclass�� ������ ������� ��� ������ 
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// num += 10; // �ܺ�Ŭ������ �ν��Ͻ� ������ �� �� ����
			// ������ ������� ��� �����ѵ�, num�� �ܺ� Ŭ������ ��������̹Ƿ�
			// ���� ���� �����ϴ� ���簡 �Ͼ ���� 
			sNum += 10; // ���� ������ �� ������
			
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}
		
		// ���� �޼����̱� ������ ���� ������ ��� �Ұ�
		// �� Ŭ������ ������ ������� ȣ��Ǵ� �޼����̱� ���� 
		static void sTest() {
			System.out.println(sNum);
//			System.out.println(iNum);
			System.out.println(sInNum);
		}
	}
}
 
public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		OutClass outClass = new OutClass();
//		outClass.inClass.inTest();
//		
//		OutClass.InClass inClass = outClass.new InClass();
//		inClass.inTest();
//		
//		
//		// ���� ���� Ŭ����
//		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
//		sInClass.inTest(); // �ν��Ͻ� �޼���� Ŭ���� ���� �Ŀ� ȣ��Ǿ�� 
		
		// ���� Ŭ���� ���� ��� ȣ��� 
		OutClass.InStaticClass.sTest();
	}

}
