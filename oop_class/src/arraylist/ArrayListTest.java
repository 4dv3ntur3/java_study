package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ctrl shift O[��] -> �ڵ� import
		// Ŭ���ϰ� f1 ->  ���� -> java doc for ��¼�� ������ ���� ��
		// ArrayList���� String type�� ������ ���ڴ�
		
		ArrayList<String> list = new ArrayList<String>();
		
		// ���׸� Ÿ������ (5������ʹ� �̷��� �� �� ��) 
//		ArrayList list = new ArrayList();
		// Ÿ�� ���� �� �ϸ� String s = list.get(i)�� �� ����
		// object�� ����� (�ֻ��� Ÿ��)
		// �׋��� String s = (String)list.get(i)�� type casting �� ��� 
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		// ���� for��
		for(String s: list) {
			System.out.println(s);
		}

		// ������ for��
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			// list[i]�� �� ��. ArrayList������ index ���� ���� �� ��. 
			// ���� �迭������ ���� 
		}
		
	}

}
